package top.xinzhang0618.producer;

import com.alibaba.ttl.TtlRunnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
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
    MallardDuck mallardDuck = new MallardDuck();
    mallardDuck.performFly();
    mallardDuck.setFlyBehavior(new FlyDown());
    mallardDuck.performFly();
  }
}
