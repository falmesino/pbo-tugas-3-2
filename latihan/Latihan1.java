/**
 * Latihan1.java
 * 231232028 - Falmesino Abdul Hamid
 * Latihan 1 - Pengecekan kelompok karakter
 * Buatlah program untuk menentukan kelompok suatu karakter yang dimasukkan melalui
 * keyboard. Kelompok karakter tersebut adalah huruf kecil, huruf besar, angka, dan
 * karakter khusus (tanda baca, operator dan sebagainya).
 */

import java.util.Scanner;

public class Latihan1 {
  public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukan karakter (satu ajah): ");
    char input = scanner.next().charAt(0);
    String output = "Karakter (" + input + ") adalah: ";

    if (Character.isLowerCase(input)) {
      output += "huruf kecil (lowercase)";
    } else if (Character.isUpperCase(input)) {
      output += "huruf BESAR (uppercase)";
    } else if (Character.isDigit((input))) {
      output += "angka";
    } else {
      output += "karakter khusus (tanda baca, operator, dsb.)";
    }

    System.out.println(output);

    scanner.close();
  }
}
