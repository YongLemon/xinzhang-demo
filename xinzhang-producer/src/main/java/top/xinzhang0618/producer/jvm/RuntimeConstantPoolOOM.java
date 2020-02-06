package top.xinzhang0618.producer.jvm;

import java.util.ArrayList;

/**
 * RuntimeConstantPoolOOM
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/6
 */
public class RuntimeConstantPoolOOM {

  public static void main(String[] args) {
    // 使用List保持引用, 避免GC
    ArrayList<String> list = new ArrayList<>();
    int i = 0;
    while (true) {
      list.add(String.valueOf(i++).intern());
    }
  }
}
