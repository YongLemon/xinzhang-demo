package top.xinzhang0618.producer.design.singleton;

/**
 * BaseSingleson
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public class BaseSingleton {

  private static BaseSingleton instanse;

  private BaseSingleton() {
  }

  public static BaseSingleton getInstance() {
    if (instanse == null) {
      instanse = new BaseSingleton();
    }
    return instanse;
  }
}
