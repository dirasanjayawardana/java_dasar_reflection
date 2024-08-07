package dirapp.java_dasar_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Product;

public class RecordTest {
  // Record di java reflection tetap direpresentasikan dengan Class<T>
  // isRecord akan mengembalikan true

  @Test
  void testClassRecord() {
    Class<Product> productClass = Product.class;

    System.out.println(productClass.isRecord());
    System.out.println(Arrays.toString(productClass.getDeclaredFields()));
    System.out.println(Arrays.toString(productClass.getDeclaredMethods()));
    System.out.println(Arrays.toString(productClass.getDeclaredConstructors()));
    System.out.println(Arrays.toString(productClass.getRecordComponents()));
  }


  @Test
  void testGetRecordValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Class<Product> productClass = Product.class;
    Method id = productClass.getDeclaredMethod("id");

    Product product = new Product("1", "Product satu", 20000000L);
    System.out.println(id.invoke(product));;
  }


  @Test
  void testGetRecordValueByComponent() throws InvocationTargetException, IllegalAccessException {
    Class<Product> productClass = Product.class;

    // mengambil semua data di dalam Record
    RecordComponent[] components = productClass.getRecordComponents();

    Product product = new Product("1", "Product satu", 20000000L);

    for (RecordComponent component : components) {
      // mengambil setiap data component Record dengan getAccessor()
      Method accessor = component.getAccessor();
      System.out.println(accessor.getName());
      System.out.println(accessor.invoke(product));
    }
  }
}