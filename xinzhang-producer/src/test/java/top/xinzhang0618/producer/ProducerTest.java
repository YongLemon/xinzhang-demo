package top.xinzhang0618.producer;

import java.time.LocalDateTime;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import top.xinzhang0618.producer.service.Sender;

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

  @Autowired
  private Sender sender;

  @Test
  public void testSendMessage() {
    sender.sendMessage();
  }
}
