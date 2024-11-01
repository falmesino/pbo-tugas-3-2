/**
 * Tugas2.java
 * 231232028 - Falmesino Abdul Hamid
 * Tugas 2 - Menentukan tahun kabisat
 * 
 * Buatlah program untuk menentukan suatu tahun kabisat atau bukan di mana tahun
 * dibatasi mulai dari tahun 1900 sampai dengan tahun 2005.
 * 
 * Contoh tampilan:
 * Masukkan tahun (1900-2005) : 1923
 * 1923 bukan tahun kabisat
 * 
 * Masukkan tahun (1900-2005) : 1898
 * Maaf, tahun input dibawah 1900
 * 
 * Masukkan tahun (1900-2005) : 1996
 * 1996 adalah tahun kabisat
 * 
 * Masukkan tahun (1900-2005) : 2008
 * Maaf, tahun input diatas 2005
 */

import java.util.Scanner;

public class Tugas2 {
  public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan tahun (1900-2005): ");
    int input = scanner.nextInt();

    String output = input + " ";

    if (input < 1900) {
      output += "di bawah 1900";
    } else if (input > 2005) {
      output += "di atas 2005";
    } else if (isKabisat(input)) {
      output += "adalah tahun kabisat";
    } else {
      output += "bukan tahun kabisat";
    }

    System.out.println(output);

    scanner.close();
  }

  private static boolean isKabisat(int tahun) {
    return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
  }
}
