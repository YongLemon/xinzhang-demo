package top.xinzhang0618.producer.design.state;

/**
 * Machine
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 */
public class Machine {

  private State noCoinState;
  private State hasCoinState;
  private State noGumballState;
  private State hasGumballState;
  private State state = noGumballState;
  private int count = 0;

  public Machine(int count) {
    noCoinState = new NoCoinState(this);
    hasCoinState = new HasCoinState(this);
    noGumballState = new NoGumballState(this);
    hasGumballState = new HasGumballState(this);
    this.count = count;
    if (count > 0) {
      state = noCoinState;
    }
  }

  public void insertCoin() {
    state.insertCoin();
  }

  public void ejectCoin() {
    state.ejectCoin();
  }

  public void turnCrack() {
    state.turnCrack();
  }

  public void dispense() {
    state.dispense();
  }

  public void releaseGumball() {
    System.out.println("释放一个糖果!");
    if (count > 0) {
      count--;
    }
  }


  public State getNoCoinState() {
    return noCoinState;
  }

  public State getHasCoinState() {
    return hasCoinState;
  }

  public State getNoGumballState() {
    return noGumballState;
  }

  public State getHasGumballState() {
    return hasGumballState;
  }

  public void setHasCoinState(State hasCoinState) {
    this.hasCoinState = hasCoinState;
  }

  public void setNoGumballState(State noGumballState) {
    this.noGumballState = noGumballState;
  }

  public void setHasGumballState(State hasGumballState) {
    this.hasGumballState = hasGumballState;
  }

  public void setNoCoinState(State noCoinState) {
    this.noCoinState = noCoinState;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
