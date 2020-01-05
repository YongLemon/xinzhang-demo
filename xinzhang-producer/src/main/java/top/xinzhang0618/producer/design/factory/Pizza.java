package top.xinzhang0618.producer.design.factory;

/**
 * Pizza
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public abstract class Pizza {

  public abstract void prepare();

  public void bake() {
    System.out.println("烘焙pizza");
  }

  public void box() {
    System.out.println("包装pizza");
  }
}
