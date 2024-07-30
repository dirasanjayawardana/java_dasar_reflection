package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Person;

import java.lang.reflect.Modifier;

public class ModifierTest {
  // Modifier merupakan representasi dari Java Modifier, seperti private, protected, public, abstract, dll
  // getModifiers() --> mendapatkan data modifier
  
  @Test
  void testModifier() {

    Class<Person> personClass = Person.class;

    System.out.println(Modifier.isPublic(personClass.getModifiers()));
    System.out.println(Modifier.isFinal(personClass.getModifiers()));
    System.out.println(Modifier.isStatic(personClass.getModifiers()));
  }
}
