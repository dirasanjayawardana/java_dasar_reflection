package dirapp.java_dasar_reflection.data;

public record Product(String id, String name, Long price) {
  // Record digunakan untuk membuat class sebagai pengangkut data (data carier)
  // yang berisi data immutable(final), secara otomatis menyediakan method equals(), hashCode(), dan toString()
}


// Berikut contoh class berisi data immutable tanpa menggunakan Record

// import java.util.Objects;

// public final class Product {
//     private final String id;
//     private final String name;
//     private final Long price;

//     public Product(String id, String name, Long price) {
//         this.id = id;
//         this.name = name;
//         this.price = price;
//     }

//     public String getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public Long getPrice() {
//         return price;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Product product = (Product) o;
//         return Objects.equals(id, product.id) &&
//                 Objects.equals(name, product.name) &&
//                 Objects.equals(price, product.price);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(id, name, price);
//     }

//     @Override
//     public String toString() {
//         return "Product{" +
//                 "id='" + id + '\'' +
//                 ", name='" + name + '\'' +
//                 ", price=" + price +
//                 '}';
//     }
// }
