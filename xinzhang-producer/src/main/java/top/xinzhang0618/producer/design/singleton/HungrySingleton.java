package top.xinzhang0618.producer.design.singleton;

/**
 * HungrySingleton
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public class HungrySingleton {

  private static HungrySingleton instance = new HungrySingleton();

  private HungrySingleton() {
  }

  public HungrySingleton getInstance() {
    return instance;
  }
}
