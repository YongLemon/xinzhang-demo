package top.xinzhang0618.producer.design.factory;

/**
 * NYIngredientFactory
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public class NYIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new NYDough();
  }

  @Override
  public Sauce createSauce() {
    return new NYSauce();
  }
}
