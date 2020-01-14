package top.xinzhang0618.producer.design.factory;

/**
 * PizzaIngredientFactory
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();
}
