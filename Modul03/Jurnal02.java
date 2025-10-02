import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
         Scanner sc = new Scanner(System.in);

         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
  
         double rataRata = (a + b + c)/3.0;

         System.out.printf("%.2f", rataRata);
    }
}
