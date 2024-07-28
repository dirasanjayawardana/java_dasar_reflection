package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Person;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {
  // Parameter merupakan representasi Parameter di dalam Java Method atau Constuctor
  // untuk mengambil detail parameter dan merubah Parameter di dalam sebuah Java method
  // method.getParameters() --> mengambil semua parameter dari sebuah method
  // method.getName() --> mengambil nama method
  // parameter.getName() --> mengambil nama parameter
  // parameter.getType() --> mengambil tipe parameter


  @Test
  void getGetParameters() {
    Class<Person> personClass = Person.class;
    Method[] methods = personClass.getDeclaredMethods();

    for (Method method : methods) {
      System.out.println(method.getName());
      Parameter[] parameters = method.getParameters();
      for (Parameter parameter : parameters) {
        System.out.println("Parameter Name : " + parameter.getName());
        System.out.println("Parameter Type : " + parameter.getType());
      }
      System.out.println("===========");
    }
  }


  @Test
  void testInvokeMethodWithParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Class<Person> personClass = Person.class;
    Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

    Person person = new Person("Dira", "Sanjaya");
    // eksekusi method setFirstName
    setFirstName.invoke(person, "Budi");

    System.out.println(person.getFirstName());
  }
}
