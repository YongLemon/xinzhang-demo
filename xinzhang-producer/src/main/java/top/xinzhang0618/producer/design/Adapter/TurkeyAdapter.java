package top.xinzhang0618.producer.design.Adapter;

/**
 * TurkeyAdapter
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/15
 */
public class TurkeyAdapter implements Duck {

  Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    turkey.fly();
  }
}
