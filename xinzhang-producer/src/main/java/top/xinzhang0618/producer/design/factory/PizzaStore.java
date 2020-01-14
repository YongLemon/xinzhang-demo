package top.xinzhang0618.producer.design.factory;

/**
 * PizzaStore
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public abstract class PizzaStore {


  public void orderPizza(String type) {
    Pizza pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.box();
  }

  protected abstract Pizza createPizza(String type);
}
