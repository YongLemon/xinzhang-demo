package top.xinzhang0618.producer.design.iterator;

import java.util.Iterator;

/**
 * DinerMenuIterator
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/17
 */
public class DinerMenuIterator implements Iterator {

  private MenuItem[] menuItems;
  int positon = 0;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    if (positon >= menuItems.length || menuItems[positon] == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public Object next() {
    return menuItems[positon++];
  }

  public MenuItem[] getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }
}
