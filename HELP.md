# Java Reflection
Merupakan fitur yang memperbolehkan program java untuk mempelajari atau memodifikasi dirinya sendiri.
Contohnya bisa memodifikasi kode program yang sedang berjalan atau melihat struktur sebuah java class dari mulai semua fields, method, constructor, dll.

## Annotation
Annotation --> untuk menambahkan metadata ke kode program
Annotation bisa diakses dengan menggunakan reflection
Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
- @interface --> untuk membuat annotation
- @Target --> memberi tahu anotation bisa digunakan dimana (class, method, property, dll)
- @Retention --> memberi tahu anotation apakah disimpan di hasil kompilasi dan apakah bisa dibaca oleh reflection

## Learning
- test/ClassTest.java
- test/FieldTest.java
- test/MethodTest.java
- test/ParameterTest.java
- test/ConstructorTest.java
- test/SuperClassTest.java
- test/InterfaceTest.java
- test/ModifierTest.java
- test/PackageTest.java
- data/package-info.java
- annotation/NotBlank.java
- validation/Validator.java
- test/AnnotationTest.java
- test/EnumTest.java
- test/PrimitiveTypeTest.java