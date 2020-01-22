package top.xinzhang0618.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.xinzhang0618.producer.design.Adapter.TurkeyAdapter;
import top.xinzhang0618.producer.design.Adapter.WildTurkey;
import top.xinzhang0618.producer.design.command.Light;
import top.xinzhang0618.producer.design.command.LightOnCommand;
import top.xinzhang0618.producer.design.command.SimpleRemoteControl;
import top.xinzhang0618.producer.design.composite.Menu;
import top.xinzhang0618.producer.design.decorator.DarkRoust;
import top.xinzhang0618.producer.design.decorator.HouseBlend;
import top.xinzhang0618.producer.design.decorator.Milk;
import top.xinzhang0618.producer.design.decorator.Soy;
import top.xinzhang0618.producer.design.iterator.DinerMenu;
import top.xinzhang0618.producer.design.iterator.MenuItem;
import top.xinzhang0618.producer.design.iterator.PancakeHouseMenu;
import top.xinzhang0618.producer.design.iterator.Waitress;
import top.xinzhang0618.producer.design.observer.java.Display1;
import top.xinzhang0618.producer.design.observer.java.Display2;
import top.xinzhang0618.producer.design.observer.java.WeatherData;

/**
 * DesignTest
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/16
 */
@SpringBootTest(classes = ProducerApplication.class)
@RunWith(SpringRunner.class)
public class DesignTest {

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

  @Test
  public void testIterator() {
    Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
    waitress.printMenu();
  }

  @Test
  public void testComposite() {
    top.xinzhang0618.producer.design.composite.MenuItem menuItem1 = new top.xinzhang0618.producer.design.composite.MenuItem(
        "黄瓜");
    top.xinzhang0618.producer.design.composite.MenuItem menuItem2 = new top.xinzhang0618.producer.design.composite.MenuItem(
        "土豆");
    top.xinzhang0618.producer.design.composite.MenuItem menuItem3 = new top.xinzhang0618.producer.design.composite.MenuItem(
        "包菜");

    Menu menu = new Menu("肉类");
    menu.add(new top.xinzhang0618.producer.design.composite.MenuItem("鱼肉"));
    menu.add(new top.xinzhang0618.producer.design.composite.MenuItem("鸡肉"));

  }
}
