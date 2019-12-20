package top.xinzhang0618.consumer;

import static top.xinzhang0618.domain.mq.MqConfiguration.QUQUE_WORK_QUEUES;

import com.rabbitmq.client.Channel;
import java.time.LocalDateTime;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;

/**
 * Receiver
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/20
 */
@RabbitListener(queues = QUQUE_WORK_QUEUES)
public class Receiver {

  @RabbitHandler
  void process(Message message) {
    System.out.println("消费者接收到消息--->" + LocalDateTime.now());
    System.out.println(message);
  }
}
