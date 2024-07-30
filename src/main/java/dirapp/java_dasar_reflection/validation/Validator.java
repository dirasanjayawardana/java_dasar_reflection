package dirapp.java_dasar_reflection.validation;

import java.lang.reflect.Field;

import dirapp.java_dasar_reflection.annotation.NotBlank;

public class Validator {

  public static void validateNotBlank(Object object) throws IllegalAccessException {

    // get class
    Class<?> aClass = object.getClass();

    // get all fields
    Field[] fields = aClass.getDeclaredFields();

    // iterate each field
    for (Field field : fields) {

      // get not blank annotation
      NotBlank notBlank = field.getAnnotation(NotBlank.class);

      // check if @NotBlank is exists
      if (notBlank != null) {

        // get field value
        field.setAccessible(true);
        String value = (String) field.get(object);

        if (notBlank.allowEmptyString()) {
          // allow empty string
          // ignore
        } else {
          // not allow empty string
          value = value.trim(); // hapus semua whitespace
        }

        // check if value is empty string
        if ("".equals(value)) {
          // throw error
          throw new RuntimeException(field.getName() + " must not blank");
        }

      }
    }
  }

}