package top.xinzhang0618.producer.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/26
 */
public class WeatherData implements Subject {

  private List<Observer> observerList;
  private String temperature;

  public WeatherData() {
    observerList = new ArrayList<Observer>();
  }

  public void change(String newTemp) {
    System.out.println("气候改变了!");
    notifyObserver(newTemp);
  }

  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }

  @Override
  public void registerObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    int i = observerList.indexOf(observer);
    if (i > 0) {
      observerList.remove(i);
    }
  }

  @Override
  public void notifyObserver(String newTemp) {
    for (Observer observer : observerList) {
      observer.update(newTemp);
    }
  }
}
