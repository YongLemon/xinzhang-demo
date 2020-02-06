package top.xinzhang0618.producer.jvm;

/**
 * JavaVMStackOOM
 * VM Args: -Xss2m
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/6
 */
public class JavaVMStackOOM {

  private void dontStop() {
    while (true) {

    }
  }

  public void stackLeakByThread() {
    while (true) {
      Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
          dontStop();
        }
      });
      thread.start();
    }
  }

  public static void main(String[] args) {
    JavaVMStackOOM oom = new JavaVMStackOOM();
    oom.stackLeakByThread();
  }
}
