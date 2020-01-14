package top.xinzhang0618.producer.design.command;

/**
 * LightOnCommand
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/14
 */
public class LightOnCommand implements Command {

  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOnLight();
  }
}
