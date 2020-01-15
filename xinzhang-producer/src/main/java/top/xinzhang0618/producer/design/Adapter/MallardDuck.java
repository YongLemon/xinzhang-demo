package top.xinzhang0618.producer.design.Adapter;

/**
 * MallardDuck
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/15
 */
public class MallardDuck implements Duck {

  @Override
  public void quack() {
    System.out.println("鸭子叫");
  }

  @Override
  public void fly() {
    System.out.println("鸭子飞");
  }
}
