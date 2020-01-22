package top.xinzhang0618.producer.design.composite;

/**
 * MenuItem
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 */
public class MenuItem extends MenuComponent {

  private String name;

  public MenuItem(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.out.println("菜: " + name);
  }
}
