import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;  // simpanan total risoles
        int jumlah;      // untuk menyimpan inputan sementara

        jumlah = input.nextInt(); // untuk membaca angka pertama

        while (jumlah != 0) {    // jika input 0 berhenti
            total += jumlah;     // tambahkan ke total
            jumlah = input.nextInt(); // angka berikutnya
        }

        System.out.println(total); // total akhir
    }
}