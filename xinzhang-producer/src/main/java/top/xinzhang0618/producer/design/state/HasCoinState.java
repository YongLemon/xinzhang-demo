package top.xinzhang0618.producer.design.state;

/**
 * HasCoinState
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 */
public class HasCoinState implements State {

  Machine machine;

  public HasCoinState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void insertCoin() {
    System.out.println("已经有硬币了, 别投了!");
  }

  @Override
  public void ejectCoin() {
    System.out.println("退出硬币!");
    machine.setState(machine.getNoCoinState());
  }

  @Override
  public void turnCrack() {
    System.out.println("转动曲柄!");
    machine.setState(machine.getHasGumballState());
  }

  @Override
  public void dispense() {
    System.out.println("请转曲柄!");
  }
}
