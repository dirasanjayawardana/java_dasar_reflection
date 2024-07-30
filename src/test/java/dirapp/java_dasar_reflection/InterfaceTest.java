package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Nameable;
import dirapp.java_dasar_reflection.data.Person;

import java.util.Arrays;

public class InterfaceTest {
  // refersentasi interface pada Java Reflection tetap menggunakan Class<T>
  // untuk mengetahui Class<T> adalah interface atau bukan dengan method --> isInterface()
  // otomatis pada interface tidak ada field dan contructor
  // untuk mendapatkan apakah interface extends dari interface lain --> getInterface()

  @Test
  void testInterface() {

    Class<Nameable> nameableClass = Nameable.class;

    System.out.println(nameableClass.getName());
    System.out.println(nameableClass.isInterface());
    System.out.println(nameableClass.getSuperclass());
    System.out.println(Arrays.toString(nameableClass.getInterfaces()));
    System.out.println(Arrays.toString(nameableClass.getDeclaredFields()));
    System.out.println(Arrays.toString(nameableClass.getDeclaredMethods()));
    System.out.println(Arrays.toString(nameableClass.getDeclaredConstructors()));
  }

  @Test
  void testSuperInterfaces() {

    Class<Person> personClass = Person.class;

    System.out.println(Arrays.toString(personClass.getInterfaces()));
  }
}
