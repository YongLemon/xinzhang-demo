package top.xinzhang0618.producer.singleton;
/**
 * EnumSingleton
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/23
 * 枚举单例类: 枚举可以防止反射和反序列化破坏,但是使用起来不太灵活
 */
public enum EnumSingleton {
  INSTANCE {
    @Override
    protected void testPrint() {
      System.out.println("测试枚举单例类");
    }
  };

  protected abstract void testPrint();

  private Object data;

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public static EnumSingleton getInstance() {
    return INSTANCE;
  }
}
