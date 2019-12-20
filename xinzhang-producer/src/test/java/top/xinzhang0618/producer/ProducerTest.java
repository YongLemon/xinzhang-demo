package top.xinzhang0618.producer;

import java.time.LocalDateTime;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

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
    LocalDateTime d1 = LocalDateTime.of(2019, 12, 12, 12, 12);
    LocalDateTime d2 = LocalDateTime.of(2019, 12, 12, 12, 12);

    System.out.println(d1.isBefore(d2));
  }
}
