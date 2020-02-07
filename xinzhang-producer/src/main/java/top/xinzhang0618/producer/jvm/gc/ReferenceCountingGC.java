package top.xinzhang0618.producer.jvm.gc;

/**
 * ReferenceCountingGC
 * VM Args: -XX:+PrintGCDetails
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/7
 */
public class ReferenceCountingGC {

  private Object instance = null;
  private static final int _1MB = 1024 * 1024;
  /**
   * 占点内存以便观察GC日志
   */
  private byte[] bigSize = new byte[2 * _1MB];

  public static void main(String[] args) {
    ReferenceCountingGC objA = new ReferenceCountingGC();
    ReferenceCountingGC objB = new ReferenceCountingGC();
    objA.instance = objB;
    objB.instance = objA;
    System.gc();
  }
}
