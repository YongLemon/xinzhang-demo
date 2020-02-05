package top.xinzhang0618.producer.design.bridge;

/**
 * RemoteController
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/5
 */
public abstract class RemoteController {

  TV tv;

  void on() {
    tv.on();
  }

  void off() {
    tv.off();
  }
}
