package top.xinzhang0618.producer.design.proxy;

/**
 * PersonBeanImpl
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/23
 */
public class PersonBeanImpl implements PersonBean {

  private String name;
  private int rate;

  public PersonBeanImpl(String name, int rate) {
    this.name = name;
    this.rate = rate;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getRate() {
    return rate;
  }

  @Override
  public void setRate(int rate) {
    this.rate = rate;
  }
}
