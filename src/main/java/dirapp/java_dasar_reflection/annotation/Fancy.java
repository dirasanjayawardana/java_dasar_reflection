package dirapp.java_dasar_reflection.annotation;

import java.lang.annotation.*;

// Annotation --> untuk menambahkan metadata ke kode program
// Annotation bisa diakses dengan menggunakan reflection
// Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value

// @interface --> untuk membuat annotation
// @Target --> memberi tahu anotation bisa digunakan dimana (class, method, property, dll)
// @Retention --> memberi tahu anotation ketika sudah dicompile bisa diakses dimana saja

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE }) // annotasi bisa digunakan di class, interface, enum

public @interface Fancy {
    String name(); // jika tidak menggunakan default value, maka wajib mengisi nilai ketika menggunakan annotation

    String[] tags() default {};
}