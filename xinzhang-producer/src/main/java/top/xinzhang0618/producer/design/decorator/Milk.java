package top.xinzhang0618.producer.design.decorator;

/**
 * HouseBlend
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/31
 */
public class Milk extends CondimentDecorator {

  private Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public Integer cost() {
    return 2 + beverage.cost();
  }

  public Beverage getBeverage() {
    return beverage;
  }

  public void setBeverage(Beverage beverage) {
    this.beverage = beverage;
  }
}
