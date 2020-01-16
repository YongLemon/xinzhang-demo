package top.xinzhang0618.producer.design.template;

/**
 * Tea
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/16
 */
public class Tea extends CaffeineBeverage {

  @Override
  void brew() {
    System.out.println("冲泡茶");
  }

  @Override
  void addCondiments() {
    System.out.println("加柠檬");
  }
}
