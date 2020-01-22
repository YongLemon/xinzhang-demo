package top.xinzhang0618.producer.design.iterator;

/**
 * MenuItem
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/17
 */
public class MenuItem {

  private String name;

  public MenuItem(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "MenuItem{" +
        "name='" + name + '\'' +
        '}';
  }
}
