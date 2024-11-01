/**
 * ForCount.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 4 - Perulangan menggunakan for
 */

public class ForCount {
  public static void main (String args[]) {
    int count = 1;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(count);
      }
      count++;
      System.out.println();
    }
  }
}
