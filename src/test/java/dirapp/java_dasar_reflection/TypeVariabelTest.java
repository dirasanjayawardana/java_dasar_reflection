package dirapp.java_dasar_reflection;

import org.junit.jupiter.api.Test;

import dirapp.java_dasar_reflection.data.Data;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;


public class TypeVariabelTest {
  // TypeVariabel -> representasi java reflection untuk data generic, misal List<T>, Map<K, V>, dll

  @Test
  void testGetTypeVariables() {
    Class<Data> dataClass = Data.class;

    TypeVariable<Class<Data>>[] typeVariables = dataClass.getTypeParameters();

    for (TypeVariable<Class<Data>> variable : typeVariables) {
      System.out.println("variabel name: " + variable.getName());
      // melihat field T extends dari mana saja
      System.out.println("variabel getBounds: " + Arrays.toString(variable.getBounds()));
      System.out.println("variabel getGenericDeclaration: " + variable.getGenericDeclaration());
    }
  }
}
