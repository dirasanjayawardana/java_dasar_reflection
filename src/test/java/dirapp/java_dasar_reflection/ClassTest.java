package dirapp.java_dasar_reflection;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Person;

public class ClassTest {
  // java.lang.Class<T> merupakan representasi dari reflection untuk java Class, Interface dan Enum
  // dengan java.lang.Class bisa membaca seluruh data member yang terdapat pada java Class, Interface atau Enum
  // pada saat aplikasi berjalan

  // Membuat Class<T> reflection bisa dengan --> .class setelah nama Java Class, Interface, atau Enum
  // Membuat Class<T> reflection dari String --> Class.forClass("com.package.NamaaClass")
  // Mengambil Class<T> reflection dari object --> getClass()


  @Test
  void testCreateClass() throws ClassNotFoundException {
    Class<Person> personClass1 = Person.class;

    Class<?> personClass2 = Class.forName("dirapp.java_dasar_reflection.data.Person");

    Person person = new Person();
    Class<? extends Person> personClass3 = person.getClass();
  }


  // jika menggunakan try catch didalam method, exception langsung ditangani oleh method itu sendiri
  // jika menggunakan throws Exception pada deklarasi method, maka exception haru ditangani ketika pemanggilan method
  // pada unit test, throws Exception dari deklarasi method bisa ditangani oleh unit test
  @Test
  void testCreateClassWithTryCatch() {
    try {
      Class<Person> personClass1 = Person.class;

      Class<?> personClass2 = Class.forName("com.dirapp.java_dasar_reflection.data.Person");

      Person person = new Person();
      Class<? extends Person> personClass3 = person.getClass();
      
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }


  @Test
  void testClassMethod() {
    Class<Person> personClass = Person.class;

    System.out.println(personClass.getSuperclass());
    System.out.println(Arrays.toString(personClass.getInterfaces()));
    System.out.println(Arrays.toString(personClass.getDeclaredConstructors()));
    System.out.println(Arrays.toString(personClass.getDeclaredMethods()));
    System.out.println(Arrays.toString(personClass.getDeclaredFields()));
    System.out.println(personClass.getModifiers());
    System.out.println(personClass.getPackage());
    System.out.println(personClass.getName());
    System.out.println(personClass.getSimpleName());
  }
}
