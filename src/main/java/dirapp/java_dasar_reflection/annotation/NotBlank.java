package dirapp.java_dasar_reflection.annotation;

import java.lang.annotation.*;

// Annotation --> untuk menambahkan metadata ke kode program
// Annotation bisa diakses dengan menggunakan reflection
// Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value

// @interface --> untuk membuat annotation
// @Target --> memberi tahu anotation bisa digunakan dimana (class, method, property, dll)
// @Retention --> memberi tahu anotation ketika sudah dicompile bisa diakses dimana saja

// ElementType.TYPE --> annotasi bisa digunakan di class, interface, enum
// ElementType.FIELD --> annotasi bisa digunakan di field

@Documented // memastikan bahwa anotasi yang dibuat akan terlihat dalam dokumentasi API yang dihasilkan oleh Javadoc
@Target({
    ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {

  boolean allowEmptyString() default false; // jika tidak menggunakan default value, maka wajib mengisi nilai ketika menggunakan annotation

}