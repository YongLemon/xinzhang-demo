package top.xinzhang0618.producer.design.template;

/**
 * Tea
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/16
 */
public class Coffee extends CaffeineBeverage {

  @Override
  void brew() {
    System.out.println("冲泡咖啡");
  }

  @Override
  void addCondiments() {
    System.out.println("加糖和牛奶");
  }
}
