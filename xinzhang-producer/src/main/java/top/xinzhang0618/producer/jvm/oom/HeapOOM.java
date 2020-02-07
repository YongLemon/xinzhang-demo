package top.xinzhang0618.producer.jvm.oom;

import java.util.ArrayList;

/**
 * HeapOOM
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/15
 */
public class HeapOOM {

  static class OOMObject {

  }

  public static void main(String[] args) {
    ArrayList<OOMObject> list = new ArrayList<>();
    while (true) {
      list.add(new OOMObject());
    }
  }
}
