package top.xinzhang0618.producer.singleton;

/**
 * EagerSingleton
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/23
 * 饿汉式单例: 将构造方法私有化, 通过getInstance方法获取对象
 * 缺点: 无论对象后续是否使用, 在内存中都会存在这个对象, 若对象分配了大量资源并未使用, 会对系统性能产生影响
 */
public class EagerSingleton {

  private static final EagerSingleton instance = new EagerSingleton();

//  // 也可以通过静态代码块来初始化
//  private static final EagerSingleton instance;
//
//  static {
//    try {
//      instance = new EagerSingleton();
//    } catch (Exception e) {
//      throw e;
//    }
//  }
  private EagerSingleton() {
  }

  public static EagerSingleton getInstance() {
    return instance;
  }
}
