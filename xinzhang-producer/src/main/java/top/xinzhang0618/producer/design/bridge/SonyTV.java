package top.xinzhang0618.producer.design.bridge;

/**
 * SonyTV
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/5
 */
public class SonyTV implements TV {

  @Override
  public void on() {
    System.out.println("Sony的开启方法");
  }

  @Override
  public void off() {
    System.out.println("Sony的关闭方法");
  }
}
