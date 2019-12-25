package top.xinzhang0618.producer.design.strategy;

/**
 * FlyDown
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/25
 */
public class FlyDown implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("飞低");
  }
}
