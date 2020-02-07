package top.xinzhang0618.producer.jvm.oom;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * JavaMethodAreaOOM
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/2/6
 */
public class JavaMethodAreaOOM {

  public static void main(String[] args) {
    while (true) {
      Enhancer enhancer = new Enhancer();
      enhancer.setSuperclass(OOMObject.class);
      enhancer.setUseCache(false);
      enhancer.setCallback(new MethodInterceptor() {
        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
          return methodProxy.invokeSuper(objects, args);
        }
      });
      enhancer.create();
    }
  }

  static class OOMObject {

  }
}
