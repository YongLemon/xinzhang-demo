package top.xinzhang0618.producer.design.observer;

/**
 * OneDisplay
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2019/12/26
 */
public class OneDisplay implements Observer, Display {

  private String temp;
  private Subject weather;

  public OneDisplay(Subject weather) {
    this.weather = weather;
    weather.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("这里是一号公告板, 目前的温度是: " + this.temp);
  }

  public String getTemp() {
    return temp;
  }

  public void setTemp(String temp) {
    this.temp = temp;
  }

  @Override
  public void update(String newTemp) {
    this.temp = newTemp;
  }
}
