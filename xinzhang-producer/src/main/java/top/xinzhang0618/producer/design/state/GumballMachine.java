package top.xinzhang0618.producer.design.state;

/**
 * Machine
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/22
 * 投入硬币-->转动曲柄-->分发糖果
 */
public class GumballMachine {

  // 糖果机有四种状态, 有无硬币, 有硬币, 无糖果, 有糖果
  private final int NO_COIN = 0;
  private final int HAS_COIN = 1;
  private final int NO_GUMBALL = 2;
  private final int HAS_GUMBALL = 3;

  private int state = NO_GUMBALL;
  private int gumballNum;

  public GumballMachine(int gumballNum) {
    this.gumballNum = gumballNum;
    if (gumballNum > 0) {
      state = NO_COIN;
    }
  }

  /**
   * 投入硬币
   */
  public void insertCoin() {
    switch (state) {
      case NO_COIN:
      case HAS_GUMBALL:
        System.out.println("有硬币了!请转动曲柄!");
        state = HAS_COIN;
        break;
      case HAS_COIN:
        System.out.println("有硬币了别再投了!");
        break;
      case NO_GUMBALL:
        System.out.println("投也没用, 糖果售罄!");
        break;
    }
  }

  /**
   * 退回硬币
   */
  public void ejectCoin() {
    switch (state) {
      case NO_COIN:
        System.out.println("请先投入硬币!");
        break;
      case NO_GUMBALL:
        System.out.println("糖没了, 硬币也是不会退的!");
        break;
      case HAS_GUMBALL:
        System.out.println("已经转动了曲柄, 不给退!");
        break;
      case HAS_COIN:
        System.out.println("退回硬币!");
        state = NO_COIN;
        break;
    }
  }

  /**
   * 转动曲柄
   */
  public void turnCrack() {
    switch (state) {
      case NO_COIN:
        System.out.println("先投硬币才能转!");
        break;
      case HAS_COIN:
        if (gumballNum > 0) {
          state = HAS_GUMBALL;
        } else {
          state = NO_GUMBALL;
        }
        break;
      case HAS_GUMBALL:
        System.out.println("转过一次不能再转了!");
        break;
      case NO_GUMBALL:
        System.out.println("没糖, 转也没用!");
        break;
    }
  }

  /**
   * 发放糖果
   */
  public void dispense() {
    switch (state) {
      case NO_COIN:
        System.out.println("先付钱!");
        break;
      case HAS_COIN:
        System.out.println("先转曲柄!");
        break;
      case NO_GUMBALL:
        System.out.println("没有糖果了!");
        break;
      case HAS_GUMBALL:
        gumballNum--;
        if (gumballNum <= 0) {
          System.out.println("现在没糖了!");
          state = NO_GUMBALL;
        } else {
          System.out.println("发一个糖果!");
          state = NO_COIN;
        }
    }
  }
}
