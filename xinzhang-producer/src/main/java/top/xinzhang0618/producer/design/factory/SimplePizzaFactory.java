package top.xinzhang0618.producer.design.factory;

/**
 * SimplePizzaFactory
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public class SimplePizzaFactory {

  public Pizza createPizza(String type) {
    if ("cheese".equals(type)) {
      return new CheessePizza();
    } else if ("clam".equals(type)) {
      return new ClamPizza();
    }
    return null;
  }
}
