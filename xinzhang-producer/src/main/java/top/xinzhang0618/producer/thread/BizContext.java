package top.xinzhang0618.producer.thread;

/**
 * BizContext
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/25
 */
public class BizContext {
  private static ThreadLocal<Long> localUserId = new ThreadLocal<>();
  private static ThreadLocal<String> localUserName = new ThreadLocal<>();

  public static void setUserId(Long userId) {
    localUserId.set(userId);
  }

  public static void setUserName(String userName) {
    localUserName.set(userName);
  }


  public static void removeUserId() {
    localUserId.remove();
  }

  public static void removeUserName() {
    localUserName.remove();
  }


  public static Long getUserId() {
    return localUserId.get();
  }

  public static String getUserName() {
    return localUserName.get();
  }
}
