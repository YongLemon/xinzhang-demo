package top.xinzhang0618.producer.design.factory;

/**
 * NYPizzaFactory
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public class NYPizzaFactory extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    if ("cheese".equals(type)) {
      return new NYCheessePizza();
    } else if ("clam".equals(type)) {
      return new NYClamPizza();
    }
    return null;
  }
}
