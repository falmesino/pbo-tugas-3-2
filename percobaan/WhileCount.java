/**
 * WhileCount.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 5 - Perulangan menggunakan while
 */

public class WhileCount {
  public static void main (String args[]) {
    int count = 1;
    int i = 0;
    while (i < 9) {
      int j = 0;
      while (j < i + 1) {
        System.out.print(count);
        j++;
      }
      count++;
      System.out.println();
      i++;
    }
  }
}
