package top.xinzhang0618.producer.jvm.oom;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/**
 * DirectMemoryOOM
 * VM Args:-Xmx20m -XX:MaxDirectMemorySize=10M
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/6
 */
public class DirectMemoryOOM {

  private static final int _1MB = 1024 * 1024;

  public static void main(String[] args) throws IllegalAccessException {
    Field unSafeField = Unsafe.class.getDeclaredFields()[0];
    unSafeField.setAccessible(true);
    Unsafe unsafe = (Unsafe) unSafeField.get(null);
    while (true) {
      unsafe.allocateMemory(_1MB);
    }
  }
}
