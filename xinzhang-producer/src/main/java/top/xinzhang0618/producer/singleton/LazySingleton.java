package top.xinzhang0618.producer.singleton;

/**
 * LazySingleton
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/23
 * 饱汉式单例: 将构造方法私有化, 通过getInstance方法获取对象
 * 第一步判断instance是否等于null,假如此时thread1和thread2同时判断都为null.
 * 同步代码块儿能保证只有一个线程进入到下面的代码去创建一个示例,其中使用了volatile关键字,
 * 保证了instance实例在所有线程的可见性,这个关键字是十分有必要的.当thread1创建一个实例之后,thread2能够第一时间拿到实例并返回
 */
public class LazySingleton {

  public static volatile LazySingleton instance;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {
    if (instance == null) {
      synchronized (LazySingleton.class) {
        instance = new LazySingleton();
      }
    }
    return instance;
  }

}
