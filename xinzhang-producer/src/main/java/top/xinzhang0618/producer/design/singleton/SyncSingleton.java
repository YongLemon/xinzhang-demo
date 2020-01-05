package top.xinzhang0618.producer.design.singleton;

/**
 * SyncSingleton
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public class SyncSingleton {

  private static SyncSingleton instance;

  private SyncSingleton() {
  }

  public synchronized SyncSingleton getInstance() {
    if (instance == null) {
      instance = new SyncSingleton();
    }
    return instance;
  }
}
