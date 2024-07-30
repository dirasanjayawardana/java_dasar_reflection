package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Person;

public class SuperClassTest {
  // dengan java reflection, bisa mengetahui Super Class dari sebuah Java Class
  // melihat sebuah Java class extend dari class mana
  
  @Test
  void testGetSuperClass() {
    Class<Person> personClass = Person.class;
    System.out.println(personClass);

    Class<? super Person> objectClass = personClass.getSuperclass();
    System.out.println(objectClass);

    Class<? super Person> nullClass = objectClass.getSuperclass();
    System.out.println(nullClass);
  }
}
