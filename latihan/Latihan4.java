/**
 * Latihan4.java
 * 231232028 - Falmesino Abdul Hamid
 * Latihan 4 - Menampilkan deret bilangan genap
 * 
 * Buatlah program untuk menampilkan deret bilangan genap dari 2 sampai dengan 20
 * kecuali kelipatan 6.
 * 
 * Contoh Tampilan:
 * 2 4 8 10 14 16 20
 */

 public class Latihan4 {
  public static void main (String args[]) {
    String output = "";

    // Loop dari 2 sampai 20, tampilkan yang genap kecuali kelipatan 6
    for (int i = 2; i <= 20; i += 2) {
      if (i % 6 == 0) {
        continue;
      }
      output += " " + i;
    }

    System.out.println(output);
  }
}
