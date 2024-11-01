/**
 * Latihan3.java
 * 231232028 - Falmesino Abdul Hamid
 * Latihan 3 - Deret Fibonacci
 * 
 * Buatlah program untuk menampilkan deret Fibonacci!
 * 
 * Contoh Tampilan:
 * Masukkan berapa deret Fibonacci? 8 
 * 8 deret Fibonacci = 1 1 2 3 5 8 13 21
 */

import java.util.Scanner;

 public class Latihan3 {
  public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukan berapa deret Fibonacci? ");
    int input = scanner.nextInt();

    String output = input + " deret Fibonacci = ";

    int a = 1, b = 1;

    for (int i = 1; i <= input; i++) {
      output += a + " ";
      
      int c = a + b;
      a = b;
      b = c;
    }

    System.out.println(output);

    scanner.close();
  }
}
