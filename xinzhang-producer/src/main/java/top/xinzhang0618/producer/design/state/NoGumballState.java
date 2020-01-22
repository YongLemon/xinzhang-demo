package top.xinzhang0618.producer.design.state;

/**
 * NoGumballState
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 */
public class NoGumballState implements State {

  Machine machine;

  public NoGumballState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void insertCoin() {
    System.out.println("没有糖果了, 投币也没用!");
  }

  @Override
  public void ejectCoin() {
    System.out.println("无法退币!");
  }

  @Override
  public void turnCrack() {
    System.out.println("没有糖果了, 转也没有用!");
  }

  @Override
  public void dispense() {
    System.out.println("发放失败!没有糖果了!");
  }
}
