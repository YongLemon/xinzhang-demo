package top.xinzhang0618.producer.design.bridge;

/**
 * ConcretController
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/5
 */
public class ConcretController extends RemoteController {

  /**
   * 新增了个开和关的方法
   */
  void onAndOff() {
    super.on();
    super.off();
  }
}
