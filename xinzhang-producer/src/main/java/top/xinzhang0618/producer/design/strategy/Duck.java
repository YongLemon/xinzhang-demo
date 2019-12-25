package top.xinzhang0618.producer.design.strategy;

/**
 * Duck
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/25
 */
public abstract class Duck {

  FlyBehavior flyBehavior;

  public void performFly() {
    flyBehavior.fly();
  }

  public FlyBehavior getFlyBehavior() {
    return flyBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }
}
