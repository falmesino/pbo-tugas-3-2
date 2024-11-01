/**
 * ContinueLoop.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 7 - Perulangan dengan break
 */

 public class ContinueLoop {
  public static void main (String args[]) {
    int a, b;

    for (a = 0; a < 2; a++) {
      for (b = 0; b < 3; b++) {
        if (b == 1) continue;
        System.out.println("a = " + a + "; b = " + b);
      }
    }
  }
}
