package top.xinzhang0618.producer.design.state;

/**
 * NoCoinState
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 */
public class NoCoinState implements State {

  Machine machine;

  public NoCoinState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void insertCoin() {
    System.out.println("有硬币了, 请转动曲柄!");
    machine.setState(machine.getHasCoinState());
  }

  @Override
  public void ejectCoin() {
    System.out.println("没有硬币, 无法退!");
  }

  @Override
  public void turnCrack() {
    System.out.println("没有硬币, 不能转曲柄!");
  }

  @Override
  public void dispense() {
    System.out.println("请投币!");
  }
}
