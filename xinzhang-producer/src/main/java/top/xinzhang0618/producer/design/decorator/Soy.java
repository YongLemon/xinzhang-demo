package top.xinzhang0618.producer.design.decorator;

/**
 * DarkRoust
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/31
 */
public class Soy extends CondimentDecorator {

  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public Integer cost() {
    return 1 + beverage.cost();
  }

  public Beverage getBeverage() {
    return beverage;
  }

  public void setBeverage(Beverage beverage) {
    this.beverage = beverage;
  }
}
