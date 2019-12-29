package top.xinzhang0618.producer.design.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Display1
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/29
 */
public class Display2 implements Observer, Display {

  Observable observable;
  private String disTemp;

  public Display2(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData data = (WeatherData) o;
      this.disTemp = data.getTemp();
      System.out.println("接收到的参数为: " + (String) arg);
    }
  }

  public String getDisTemp() {
    return disTemp;
  }

  public void setDisTemp(String disTemp) {
    this.disTemp = disTemp;
  }

  @Override
  public void display() {
    System.out.println("这里是布告板2,现在的温度是: " + this.disTemp);
  }
}
