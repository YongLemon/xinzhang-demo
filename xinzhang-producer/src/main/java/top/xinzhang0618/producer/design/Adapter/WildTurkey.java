package top.xinzhang0618.producer.design.Adapter;

/**
 * WildTurkey
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/15
 */
public class WildTurkey implements Turkey {

  @Override
  public void gobble() {
    System.out.println("咯咯叫");
  }

  @Override
  public void fly() {
    System.out.println("火鸡飞");
  }
}
