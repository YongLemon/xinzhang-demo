package top.xinzhang0618.producer.design.observer.java;

import java.util.Observable;

/**
 * WeatherData
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/29
 */
public class WeatherData extends Observable {

  private String temp;

  public void tempChange(String newTemp) {
    this.setTemp(newTemp);
    setChanged();
    notifyObservers("测试传参");
  }

  public String getTemp() {
    return temp;
  }

  public void setTemp(String temp) {
    this.temp = temp;
  }
}
