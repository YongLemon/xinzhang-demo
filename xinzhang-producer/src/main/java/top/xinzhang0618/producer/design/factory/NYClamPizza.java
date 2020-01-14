package top.xinzhang0618.producer.design.factory;

/**
 * ClamPizza
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/1
 */
public class NYClamPizza extends Pizza {

  private PizzaIngredientFactory pizzaIngredientFactory;

  public NYClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepare() {
    // 工厂是抽象的, 可以根据传入工厂的不同, 使用不同工厂的制造方法
    Dough dough = pizzaIngredientFactory.createDough();
    Sauce sauce = pizzaIngredientFactory.createSauce();
  }
}
