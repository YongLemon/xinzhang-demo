package top.xinzhang0618.producer.jvm;

/**
 * JavaVMStackSOF
 * VM Args: -Xss128k
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/6
 */
public class JavaVMStackSOF {

  private int stackLength = 1;

  public void stackLeak() {
    stackLength++;
    stackLeak();
  }

  public static void main(String[] args) {
    JavaVMStackSOF oom = new JavaVMStackSOF();
    try {
      oom.stackLeak();
    } catch (Throwable e) {
      System.out.println("stack length: " + oom.stackLength);
      throw e;
    }
  }
}
