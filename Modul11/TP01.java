import java.util.Scanner;

public class TP01 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahPeserta = input.nextInt();
        input.nextLine(); 

        String[] namaPeserta = new String[jumlahPeserta];

        for (int i = 0; i < jumlahPeserta; i++) {
            namaPeserta[i] = input.nextLine();
        }

        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + namaPeserta[i]);
        }
    }
}