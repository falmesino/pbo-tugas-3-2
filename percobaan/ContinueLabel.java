/**
 * ContinueLabel.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 9 - Pemakaian label pada kondisi continue
 */

 public class ContinueLabel {
  public static void main (String args[]) {
    int a, b;

    Mulai:
    for (a = 0; a < 2; a++)
      for (b = 0; b < 3; b++) {
        if (b == 1) continue Mulai;
        System.out.println("a = " + a + "; b = " + b);
      }
  }
}
