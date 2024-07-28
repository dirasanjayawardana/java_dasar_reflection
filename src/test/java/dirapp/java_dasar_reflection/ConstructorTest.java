package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;
import dirapp.java_dasar_reflection.data.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorTest {
  // Constructor<T> merupakan representasi Constructor di dalam Java Class
  // untuk mengambil detail dan menjalankan Constructor di dalam sebuah Java Class
  // Constructor<T> merupakan tipe data generic, mengikuti tipe data dari Class<T> nya
  // getConstructor() --> mendapatkan constructor dengan visibility atau modifier public
  // getDeclaredConstructor() --> mendapatkan semua constructor dengan semua visibility atau modifier
  // constructor.newInstance() --> membuat object baru dengan Constructor
  

  @Test
  void testGetConstructors() {
    Class<Person> personClass = Person.class;

    Constructor<?>[] constructors = personClass.getDeclaredConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println(constructor.getName());
      System.out.println(Arrays.toString(constructor.getParameterTypes()));
      System.out.println("=========");
    }
  }


  @Test
  void testCreateObjectUsingConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<Person> personClass = Person.class;

    // mengambil constructor yang tidak memiliki parameter
    Constructor<Person> constructor = personClass.getConstructor();
    // mengambil constructor yang memiliki parameter
    Constructor<Person> constructorParameters = personClass.getConstructor(String.class, String.class);

    // membuat object baru dengan Constructor yang tidak memiliki parameter
    Person person1 = constructor.newInstance();
    // membuat object baru dengan Constructor dengan parameter
    Person person2 = constructorParameters.newInstance("Dira", "Sanjaya");

    System.out.println(person1);
    System.out.println(person2);
  }
}
