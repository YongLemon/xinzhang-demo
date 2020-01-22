package top.xinzhang0618.producer.design.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Waitress
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/17
 */
public class Waitress {

  private Menu pancakeHouseMenu;
  private Menu dinerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    printMenu(pancakeHouseMenu.createIterator());
    printMenu(dinerMenu.createIterator());
  }

  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
