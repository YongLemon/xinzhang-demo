package top.xinzhang0618.producer.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * OwnerInvocationHandler
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/3
 */
public class OwnerInvocationHandler implements InvocationHandler {

  PersonBean person;

  public OwnerInvocationHandler(PersonBean person) {
    this.person = person;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {
      if (method.getName().equals("setName") || method.getName().startsWith("get")) {
        return method.invoke(person, args);
      } else {
        throw new IllegalAccessException();
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }
}
