package top.xinzhang0618.producer.design.strategy;

/**
 * MallardDuck
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/25
 */
public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyHigh();
  }

}
