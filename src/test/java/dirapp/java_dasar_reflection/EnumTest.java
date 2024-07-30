package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;
import dirapp.java_dasar_reflection.data.Gender;

import java.util.Arrays;


public class EnumTest {
  // Enum di Java Reflection direpresentasikan dengan Class<T>
  // karena Enum juga menambahkan field, method dan constructor
  // isEnum() --> untuk mengecek apakah sebuah enum
  // getEnumConstants() --> untuk mendapatkan semua nilai Enum
  // super class dar enum adalah java.lang.Enum
  
  @Test
  void testEnum() {

    Class<Gender> genderClass = Gender.class;

    System.out.println(genderClass.getName());
    System.out.println(genderClass.getSuperclass());
    System.out.println(Arrays.toString(genderClass.getEnumConstants()));
    System.out.println(genderClass.isEnum());
    System.out.println(Arrays.toString(genderClass.getDeclaredFields()));
    System.out.println(Arrays.toString(genderClass.getDeclaredConstructors()));
    System.out.println(Arrays.toString(genderClass.getDeclaredMethods()));

  }
}
