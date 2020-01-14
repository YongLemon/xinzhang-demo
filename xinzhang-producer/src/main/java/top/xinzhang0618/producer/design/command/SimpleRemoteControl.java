package top.xinzhang0618.producer.design.command;

/**
 * SimpleRemoteController
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/14
 */
public class SimpleRemoteControl {

  Command slot;

  public SimpleRemoteControl() {
  }

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
