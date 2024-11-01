/**
 * SwitchName.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 2 - Percabangan menggunakan switch
 */

 public class SwitchName {
  public static void main (String args[]) {
    char firstInitial = 'a';
    System.out.println("Masukan huruf awal nama anda: ");

    try {
      firstInitial = (char) System.in.read();
    } catch (Exception e) {
      System.out.println("Error: " + e.toString());
    }

    switch (firstInitial) {
      case 'a': 
        System.out.println("Nama anda pasti Asep!");
      case 'b':
        System.out.println("Nama anda pasti Brodin!");
      case 'c':
        System.out.println("Nama anda pasti Cecep!");
      default:
        System.out.println("Nama anda tidak terkenal!");
    }
  }
}
