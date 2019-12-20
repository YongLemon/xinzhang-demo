package top.xinzhang0618.producer.service.impl;

import java.time.LocalDateTime;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xinzhang0618.producer.service.Sender;

/**
 * Sender
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/20
 */
@Service
public class SenderImpl implements Sender {

  @Autowired
  RabbitTemplate rabbitTemplate;

  @Override
  public void sendMessage() {
    rabbitTemplate
        .convertAndSend("xinzhang.mq.topic", "xinzhang.mq.work.queues.demo", "发送消息测试--->" + LocalDateTime.now());
    System.out.println("生产者已经发送了消息");
  }
}
