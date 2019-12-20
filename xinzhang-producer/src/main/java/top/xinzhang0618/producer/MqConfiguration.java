package top.xinzhang0618.producer;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MqConfiguration
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/20
 */
@Configuration
public class MqConfiguration {

  public static final String EXCHANGE_TOPIC = "xinzhang.mq.topic";
  public static final String EXCHANGE_BASE = "xinzhang.mq";
  public static final String TOPIC_MESSAGES = "xinzhang.mq.#";

  public static final String QUQUE_WORK_QUEUES = "xinzhang.mq.work.queues";
  public static final String QUQUE_WORK_QUEUES_BINDING_KEY = "xinzhang.mq.work.queues.demo";

  @Bean
  public Exchange baseExchange() {
    return ExchangeBuilder.topicExchange(EXCHANGE_BASE).build();
  }

  @Bean
  public Exchange topicExchange() {
    return ExchangeBuilder.topicExchange(EXCHANGE_TOPIC).build();
  }

  @Bean
  public Queue workQueuesQueue() {
    return QueueBuilder.durable(QUQUE_WORK_QUEUES).build();
  }

  @Bean
  public Binding topicExchangeBinding(@Qualifier("baseExchange") Exchange baseExchange,
      @Qualifier("topicExchange") Exchange topicExchange) {
    return BindingBuilder.bind(baseExchange).to(topicExchange).with(TOPIC_MESSAGES).noargs();
  }

  @Bean
  public Binding workQueuesQueueBindindWithTopicExchange(@Qualifier("workQueuesQueue") Queue workQueuesQueue,
      @Qualifier("topicExchange") Exchange topicExchange) {
    return BindingBuilder.bind(workQueuesQueue).to(topicExchange).with(QUQUE_WORK_QUEUES_BINDING_KEY).noargs();
  }
}
