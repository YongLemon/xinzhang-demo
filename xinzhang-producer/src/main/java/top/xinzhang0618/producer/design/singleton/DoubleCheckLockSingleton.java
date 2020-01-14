package top.xinzhang0618.producer.design.singleton;

/**
 * DoubleCheckLockSingleton
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public class DoubleCheckLockSingleton {

  private volatile static DoubleCheckLockSingleton instance;

  private DoubleCheckLockSingleton() {
  }

  public DoubleCheckLockSingleton getInstance() {
    if (instance == null) {
      synchronized (DoubleCheckLockSingleton.class) {
        if (instance == null) {
          instance = new DoubleCheckLockSingleton();
        }
      }
    }
    return instance;
  }
}
