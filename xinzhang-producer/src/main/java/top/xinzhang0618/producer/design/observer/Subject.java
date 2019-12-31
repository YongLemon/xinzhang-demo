package top.xinzhang0618.producer.design.observer;

/**
 * Subject
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/26
 */
public interface Subject {

  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObserver(String newTemp);

}
