package top.xinzhang0618.producer.design.strategy;

/**
 * FlyHigh
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/25
 */
public class FlyHigh implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("飞高");
  }
}
