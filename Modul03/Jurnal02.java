import java.util.Scanner; 

public class Jurnal02 {

    public static void main(final String[] args) {
         Scanner sc = new Scanner(System.in);

         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
  
         double rataRata = (a + b + c)/3.0;

         System.out.printf("Nilai rata-rata: %.2f", rataRata);
      Scanner input = new Scanner(System.in);

      //input
      double nilaiA = input.nextDouble();
      double nilaiB = input.nextDouble();
      double nilaiC = input.nextDouble();

      double nilaiRataRata = (nilaiA + nilaiB + nilaiC) / 3.0;

      System.out.printf("Nilai rata-rata: %.2f\n", nilaiRataRata);
        input.close();
import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner tugas2 = new Scanner(System.in);

        int nilai1 = tugas2.nextInt();
        int nilai2 = tugas2.nextInt();
        int nilai3 = tugas2.nextInt();

        double jumlah = (nilai1 + nilai2 + nilai3) / 3;
        System.out.print("Nilai rata-rata: ");
        System.out.printf("%.2f", jumlah);

        tugas2.close();
    }
}