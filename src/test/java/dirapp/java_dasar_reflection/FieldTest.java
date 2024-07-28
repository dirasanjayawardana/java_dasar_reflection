package dirapp.java_dasar_reflection;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Person;

public class FieldTest {
  // Field merupakan representasi Field di dalam Java Class, untuk mengambil dan merubah Field di dalam sebuah Java Class
  // getFields() --> mendapatkan public Field
  // getDeclaredField() --> mendapatkan semua Field dengan semua visibility atau modifier
  // getField(namaField) atau getDeclaredField(namaField) --> mendapatkan Field sesuai nama


  @Test
  void testGetFields() {
    Class<Person> personClass = Person.class;

    Field[] fields = personClass.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field.getName() + " : " + field.getType().getName());
    }
  }


  @Test
  void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
    Class<Person> personClass = Person.class;
    Field firstName = personClass.getDeclaredField("firstName");
    // karena field firstName adalah private, agar bisa diakses, setAccessible menjadi true
    firstName.setAccessible(true);

    Person person1 = new Person("Dira", "Sanjaya");
    String result = (String) firstName.get(person1);
    System.out.println(result);

    Person person2 = new Person("Budi", "Pratama");
    String result2 = (String) firstName.get(person2);
    System.out.println(result2);
  }


  @Test
  void testSetFieldValue() throws NoSuchFieldException, IllegalAccessException {
    Class<Person> personClass = Person.class;
    Field firstName = personClass.getDeclaredField("firstName");
    firstName.setAccessible(true);

    Person person1 = new Person("Dira", "Sanjaya");
    firstName.set(person1, "Joko"); // person1.setFirstName("Joko");
    System.out.println(person1.getFirstName());

    Person person2 = new Person("Budi", "Pratama");
    firstName.set(person2, "Tono"); // person2.setFirstName("Tono");
    System.out.println(person2.getFirstName());
  }


  // jika menggunakan try catch didalam method, exception langsung ditangani oleh method itu sendiri
  // jika menggunakan throws Exception pada deklarasi method, maka exception haru ditangani ketika pemanggilan method
  // pada unit test, throws Exception dari deklarasi method bisa ditangani oleh unit test
  @Test
  void testSetFieldValueWithTryCatch() {
    try {
      Class<Person> personClass = Person.class;
      Field firstName = personClass.getDeclaredField("firstName");
      firstName.setAccessible(true);

      Person person1 = new Person("Dira", "Sanjaya");
      firstName.set(person1, "Joko"); // person1.setFirstName("Joko");
      System.out.println(person1.getFirstName());

      Person person2 = new Person("Budi", "Pratama");
      firstName.set(person2, "Tono"); // person2.setFirstName("Tono");
      System.out.println(person2.getFirstName());
    } catch (NoSuchFieldException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
