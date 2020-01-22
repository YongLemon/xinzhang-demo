package top.xinzhang0618.producer.design.state;

/**
 * State
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 */
public interface State {

  void insertCoin();

  void ejectCoin();

  void turnCrack();

  void dispense();
}
