package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Person;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodTest {
  // Method merupakan representasi Method di dalam Java Class, untuk mengambil dan merubah Method di dalam sebuah Java Class
  // getMethod() --> mendapatkan public method
  // getDeclaredMethod() --> mendapatkan semua method dengan semua visibility atau modifier
  // getMethod(namaMethod) atau getDeclaredMethod(namaMethod) --> mendapatkan method sesuai nama

  
  @Test
  void testGetMethods() {
    Class<Person> personClass = Person.class;

    Method[] methods = personClass.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
      System.out.println(method.getReturnType());
      System.out.println(Arrays.toString(method.getParameterTypes()));
      System.out.println(Arrays.toString(method.getExceptionTypes()));
      System.out.println("===============");
    }
  }


  @Test
  void testGetMethodValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Class<Person> personClass = Person.class;
    Method getFirstName = personClass.getDeclaredMethod("getFirstName");

    Person person = new Person("Dira", "Sanjaya");
    // eksekusi method dari class Person
    String firstName = (String) getFirstName.invoke(person);
    System.out.println(firstName);
  }
}
