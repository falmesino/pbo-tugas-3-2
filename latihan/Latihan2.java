/**
 * Latihan2.java
 * 231232028 - Falmesino Abdul Hamid
 * Latihan 2 - Menampilkan bilangan faktorial
 * 
 * Bilangan bulat faktorial n, ditulis dengan n! adalah dihasilkan dari mengalikan
 * dari 1 sampai dengan n. Contohnya 5! = 1 x 2 x 3 x 4 x 5 =120.
 * Buatlah program untuk menampilkan tabel hasil faktorial dari suatu bilangan yang
 * diinputkan (tampilan bilangan rata kanan)
 */

import java.util.Scanner;

public class Latihan2 {
  public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukan bilangan faktorial: ");
    int input = scanner.nextInt();

    System.out.printf("%-10s %-10s%n", "n", "n!");
    System.out.println("------------------------------");

    for (int i = 1; i <= input; i++) {
      System.out.printf("%-10d %-10d%n", i, faktorial(i));
    }

    System.out.println("------------------------------");
    scanner.close();
  }

  private static long faktorial(int angka) {
    long output = 1;

    for (int i = 1; i <= angka; i++) {
      output *= i;
    }

    return output;
  }
}
