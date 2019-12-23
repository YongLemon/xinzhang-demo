package top.xinzhang0618.producer.singleton;

/**
 * LazyInnerClassSingleton
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/23
 * 静态内部类单例类: 调用getInstance方法时才回去加载静态内部类, 也是线程安全的
 * 既不会占用资源, 又保证了按需加载
 */
public class LazyInnerClassSingleton {

  private LazyInnerClassSingleton() {
  }

  private static class SingletonHelper {

    private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
  }

  public static LazyInnerClassSingleton getInstance() {
    return SingletonHelper.INSTANCE;
  }
}
