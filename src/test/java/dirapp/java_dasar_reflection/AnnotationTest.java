package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Person;
import dirapp.java_dasar_reflection.validation.Validator;

public class AnnotationTest {

  @Test
  void testValidateUsingAnotation() throws IllegalAccessException {

    Person person = new Person("Dira", "");
    Validator.validateNotBlank(person);
  }
}