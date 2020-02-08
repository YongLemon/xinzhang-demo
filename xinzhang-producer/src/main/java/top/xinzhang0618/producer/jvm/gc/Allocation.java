package top.xinzhang0618.producer.jvm.gc;

/**
 * Allocation
 * VM Args: -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/8
 */
public class Allocation {

  private static final int _1MB = 1024 * 1024;

  public static void main(String[] args) {
    byte[] allocation1, allocation2, allocation3, allocation4;
    allocation1 = new byte[2 * _1MB];
    allocation2 = new byte[2 * _1MB];
    allocation3 = new byte[2 * _1MB];
    allocation4 = new byte[4 * _1MB];
  }
}
