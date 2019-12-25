package top.xinzhang0618.producer.singleton;

/**
 * SingletonTest
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/23
 */
public class SingletonTest {

  public void getSingleton() {
    EagerSingleton instance = EagerSingleton.getInstance();
    System.out.println(EnumSingleton.getInstance());
  }
}
