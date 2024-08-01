package dirapp.java_dasar_reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Car;

public class ProxyTest {
  // Proxy --> untuk membuat object dari interface tanpa harus membuat implementasi sebuah interface
  // Proxy.newProxyInstance() --> membuat proxy
  // ketika membuat proxy, secara dinamis menerima method yang dipanggil, dan mengembalikan value di method tersebut, dengan InvocationHandler (Meta Programming)

  @Test
  void testProxy() {
    InvocationHandler invocationHandler = new InvocationHandler() {
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equals("getName")){
          return "Car Proxy";
        }

        if(method.getName().equals("run")){
          System.out.println("Car is running");
        }

        return null;
      }
    };

    // hasil dari "(Car) Proxy.newProxyInstance" adalah object car
    Car car = (Car) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
        new Class[]{Car.class}, invocationHandler);

    System.out.println(car.getClass());
    System.out.println(car.getName());
    car.run();
  }
}