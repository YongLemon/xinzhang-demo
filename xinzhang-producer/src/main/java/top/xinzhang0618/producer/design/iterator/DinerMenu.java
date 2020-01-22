package top.xinzhang0618.producer.design.iterator;

import java.util.Iterator;

/**
 * DinerMenu
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/17
 */
public class DinerMenu implements Menu {

  private MenuItem[] menuItems;

  public DinerMenu() {
    this.menuItems = new MenuItem[3];
    menuItems[0] = new MenuItem("肉");
    menuItems[1] = new MenuItem("蛋");
    menuItems[2] = new MenuItem("菜");
  }

  public MenuItem[] getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
