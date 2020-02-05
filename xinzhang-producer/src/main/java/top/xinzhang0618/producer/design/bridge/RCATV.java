package top.xinzhang0618.producer.design.bridge;

/**
 * RCATV
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/5
 */
public class RCATV implements TV {

  @Override
  public void on() {
    System.out.println("RCA的开启方法");
  }

  @Override
  public void off() {
    System.out.println("RCA的关闭方法");
  }
}
