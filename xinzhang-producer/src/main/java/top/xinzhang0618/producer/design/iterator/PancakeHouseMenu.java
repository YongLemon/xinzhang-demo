package top.xinzhang0618.producer.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * PancakeHouseMenu
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/17
 */
public class PancakeHouseMenu implements Menu {

  private List<MenuItem> menuItems;

  public PancakeHouseMenu() {
    this.menuItems = new ArrayList<>();
    menuItems.add(new MenuItem("煎饼1"));
    menuItems.add(new MenuItem("煎饼2"));
    menuItems.add(new MenuItem("煎饼3"));
    menuItems.add(new MenuItem("煎饼4"));
  }

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public Iterator createIterator() {
    return this.menuItems.iterator();
  }
}
