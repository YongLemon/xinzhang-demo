package top.xinzhang0618.producer.design.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Menu
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 */
public class Menu extends MenuComponent {

  private List<MenuComponent> menuComponentList = new ArrayList<>();
  private String name;

  public Menu(String name) {
    this.name = name;
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponentList.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menuComponentList.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int i) {
    return menuComponentList.get(i);
  }

  @Override
  public void print() {
    System.out.println("菜: " + name);
    System.out.println("--------------");
    Iterator<MenuComponent> iterator = menuComponentList.iterator();
    while (iterator.hasNext()) {
      iterator.next().print();
    }
  }

}