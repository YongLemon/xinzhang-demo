package top.xinzhang0618.producer.design.state;

/**
 * HasGunballState
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 */

public class HasGumballState implements State {

  Machine machine;

  public HasGumballState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void insertCoin() {
    System.out.println("再投没用!");
  }

  @Override
  public void ejectCoin() {
    System.out.println("已转曲柄!不能退!");
  }

  @Override
  public void turnCrack() {
    System.out.println("已转了一次!请稍等!");
  }

  @Override
  public void dispense() {
    machine.releaseGumball();
    if (machine.getCount() > 0) {
      System.out.println("发糖!");
      machine.setState(machine.getNoCoinState());
    } else {
      System.out.println("没糖了!");
      machine.setState(machine.getNoGumballState());
    }
  }
}
