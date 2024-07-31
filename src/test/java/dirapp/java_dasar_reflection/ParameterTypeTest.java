package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;
import dirapp.java_dasar_reflection.data.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class ParameterTypeTest {
  // ParameterizedType --> representasi java reflection untuk data generic, misal List<String>, Map<String>, dll
  

  @Test
  void testFieldGeneric() throws NoSuchMethodException, NoSuchFieldException {
    Class<Person> personClass = Person.class;
    Field hobbies = personClass.getDeclaredField("hobbies");
    hobbies.setAccessible(true);

    // untuk mendapatkan tipe generic dari field atau parameter
    Type type = hobbies.getGenericType();
    System.out.println(type.getClass());

    if (type instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType) type;
      System.out.println(parameterizedType.getRawType());
      System.out.println(parameterizedType.getOwnerType());
      System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
    }
  }


  @Test
  void getGetMethodGeneric() throws NoSuchMethodException {
    Class<Person> personClass = Person.class;
    Method getHobbies = personClass.getDeclaredMethod("getHobbies");

    // untuk mendapatkan tipe generic dari return atau method
    Type type = getHobbies.getGenericReturnType();
    System.out.println(type.getClass());

    if (type instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType) type;
      System.out.println(parameterizedType.getRawType());
      System.out.println(parameterizedType.getOwnerType());
      System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
    }
  }


  @Test
  void getGetMethodParameterGeneric() throws NoSuchMethodException {
    Class<Person> personClass = Person.class;
    Method setHobbies = personClass.getDeclaredMethod("setHobbies", List.class);

    // untuk mendapatkan tipe parameter yang generic dan bukan generic
    Type[] types = setHobbies.getGenericParameterTypes();
    for (Type type : types) {
      System.out.println(type.getClass());

      if (type instanceof ParameterizedType) {
        ParameterizedType parameterizedType = (ParameterizedType) type;
        System.out.println(parameterizedType.getRawType());
        System.out.println(parameterizedType.getOwnerType());
        System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
      }
    }
  }
}
