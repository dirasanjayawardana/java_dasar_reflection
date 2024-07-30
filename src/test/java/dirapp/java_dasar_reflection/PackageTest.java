package dirapp.java_dasar_reflection;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Person;

public class PackageTest {
  // Package merupakan representasi dari Java Package
  // getPackage() --> untuk mendapatkan data package dari sebuah Java Class
  // getAnnotations() --> untuk mendapatkan annotasi dari sebuah Java Class


  @Test
  void testGetPackage() {
    Class<Person> personClass = Person.class;

    Package aPackage = personClass.getPackage();

    System.out.println(aPackage.getName());
    System.out.println(Arrays.toString(aPackage.getAnnotations()));
  }
}
