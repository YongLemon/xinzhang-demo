package top.xinzhang0618.producer.design.template;

/**
 * CaffeineBeverage
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/16
 */
public abstract class CaffeineBeverage {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  private void boilWater() {
    System.out.println("煮开水");
  }

  abstract void brew();

  private void pourInCup() {
    System.out.println("倒入杯中");
  }

  abstract void addCondiments();

}
