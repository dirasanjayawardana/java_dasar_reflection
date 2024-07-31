package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;
import dirapp.java_dasar_reflection.data.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
  // di Java reflection Array juga direpresentasikan dengan Class<T>, tetapi pada Array tidak ada field, method, constructor
  // contohnya --> String[].class
  // isArray() --> untuk cek apakah sebuah array


  @Test
  void testArrayClass() {
    Class<String[]> stringArrayClass = String[].class;
    Class<int[]> intArrayClass = int[].class;
    Class<Person> personClass = Person.class;

    System.out.println(stringArrayClass.isArray());
    System.out.println(intArrayClass.isArray());
    System.out.println(personClass.isArray());
  }


  @Test
  void testArrayMember() {
    Class<String[]> stringArrayClass = String[].class;

    System.out.println(Arrays.toString(stringArrayClass.getDeclaredFields()));
    System.out.println(Arrays.toString(stringArrayClass.getDeclaredConstructors()));
    System.out.println(Arrays.toString(stringArrayClass.getDeclaredMethods()));
    
    // cek tipe data array
    System.out.println(stringArrayClass.getComponentType());
  }


  // melakukan manipulasi data array menggunakan java reflection
  @Test
  void testArrayManipulation() {
    Class<String[]> stringArrayClass = String[].class;

    // membuat array baru dengan newInstance
    String[] array = (String[]) Array.newInstance(stringArrayClass.getComponentType(), 10);

    System.out.println(Arrays.toString(array));

    // set isi array pada index tertentu
    Array.set(array, 0, "Dira");
    Array.set(array, 1, "Sanjaya");
    Array.set(array, 2, "Wardana");

    System.out.println(Arrays.toString(array));

    // mengambil data array pada index tertentu
    System.out.println(Array.get(array, 0));
    System.out.println(Array.get(array, 1));
    System.out.println(Array.get(array, 2));
  }
}
