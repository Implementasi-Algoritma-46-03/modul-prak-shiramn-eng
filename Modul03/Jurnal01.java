import java.util.Scanner;

public class Jurnal01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahUang = sc.nextInt();

        int lembar = jumlahUang / 1000;
        int sisa = jumlahUang % 1000;

        System.out.println(lembar);
        System.out.println(sisa);

        sc.close();
    public static void main(final String[] args) {
       Scanner input = new Scanner(System.in);

       //input
       int N = input.nextInt();
       int lembar = N / 1000;
       int sisaUang = N % 1000;

      System.out.println(lembar);
        System.out.println(sisaUang);
input.close();

        // Kerjakan soalnya di sini
        Scanner tugas1 = new Scanner(System.in);

        int uang = tugas1.nextInt();
        
        int jumlah = uang / 1000;
        
        System.out.println(jumlah);

        int sisa = uang % 1000;

        System.out.println(sisa);

        tugas1.close();
    }
}