package top.xinzhang0618.producer;

import com.alibaba.ttl.TtlRunnable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import top.xinzhang0618.producer.design.Adapter.Turkey;
import top.xinzhang0618.producer.design.Adapter.TurkeyAdapter;
import top.xinzhang0618.producer.design.Adapter.WildTurkey;
import top.xinzhang0618.producer.design.command.Light;
import top.xinzhang0618.producer.design.command.LightOnCommand;
import top.xinzhang0618.producer.design.command.SimpleRemoteControl;
import top.xinzhang0618.producer.design.decorator.DarkRoust;
import top.xinzhang0618.producer.design.decorator.HouseBlend;
import top.xinzhang0618.producer.design.decorator.Milk;
import top.xinzhang0618.producer.design.decorator.Soy;
import top.xinzhang0618.producer.design.observer.java.Display1;
import top.xinzhang0618.producer.design.observer.java.Display2;
import top.xinzhang0618.producer.design.observer.java.WeatherData;
import top.xinzhang0618.producer.design.strategy.FlyDown;
import top.xinzhang0618.producer.design.strategy.MallardDuck;
import top.xinzhang0618.producer.thread.BizContext;

/**
 * Test
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/20
 */
@SpringBootTest(classes = ProducerApplication.class)
@RunWith(SpringRunner.class)
public class ProducerTest {

  @Test
  public void test() {
    BizContext.setUserName("测试1");
    System.out.println(Thread.currentThread().getName() + "----111------>" + BizContext.getUserName());
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService
        .submit(
            () -> System.out.println(Thread.currentThread().getName() + "----222------>" + BizContext.getUserName()));
    executorService.execute(TtlRunnable
        .get(() -> System.out.println(Thread.currentThread().getName() + "----333------>" + BizContext.getUserName())));
  }

  @Test
  public void testStrategy() {
    WeatherData weatherData = new WeatherData();
    weatherData.setTemp("12度");
    Display1 display1 = new Display1(weatherData);
    Display2 display2 = new Display2(weatherData);
    display1.display();
    display2.display();
    weatherData.tempChange("20度");
    display1.display();
    display2.display();
  }

  @Test
  public void testDecorator() {
    //darkRoust成本10,houseBlend成本20
    //milk成本1,soy成本2

    // darkRoust加milk和soy
    DarkRoust darkRoust = new DarkRoust();
    Milk milk = new Milk(darkRoust);
    Soy soy = new Soy(milk);
    System.out.println("darkRoust的成本为: " + milk.cost());

    // houseBlend只加soy
    HouseBlend houseBlend = new HouseBlend();
    Soy soy1 = new Soy(houseBlend);
    System.out.println("houseBlend的成本为: " + soy.cost());
  }

  @Test
  public void test11() {
    LocalTime beginTime = LocalTime.of(6, 0);
    LocalTime endTime = LocalTime.of(19, 0);
    LocalDateTime testTime = LocalDateTime.now();
    LocalTime test = LocalTime.of(testTime.getHour(), 0);
    if ((test.isAfter(beginTime) || test.equals(beginTime)) && test.isBefore(endTime)) {
      System.out.println("在拦截时间内");
    }

  }

  @Test
  public void test12() {
    LocalTime beginTime = LocalTime.of(15, 0);
    LocalTime endTime = LocalTime.of(8, 0);
    LocalDateTime testTime = LocalDateTime.now().plusHours(10L);
    LocalTime test = LocalTime.of(testTime.getHour(), 0);
    boolean b = (test.isAfter(endTime) || test.equals(endTime)) && test.isBefore(beginTime);
    if (!b) {
      System.out.println("在拦截时间内");
    }
  }

  @Test
  public void testCommand() {
    LightOnCommand command = new LightOnCommand(new Light());
    SimpleRemoteControl control = new SimpleRemoteControl();
    control.setCommand(command);
    control.buttonWasPressed();
  }

  @Test
  public void testAdapter() {
    TurkeyAdapter adapter = new TurkeyAdapter(new WildTurkey());
    adapter.quack();
    adapter.fly();
  }

  private static final Pattern MOBILE_PATTERN = Pattern.compile("1[3456789]\\d{9}");


  @Test
  public void testRegex(){

  }
}
