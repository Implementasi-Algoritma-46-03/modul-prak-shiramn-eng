import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        Scanner tugas2 = new Scanner(System.in);
         // Kerjakan soalnya di sini

        String nama = tugas2.nextLine();
        int jumlah = tugas2.nextInt();
        int harga = tugas2.nextInt();

        int total = harga * jumlah;

        System.out.println("Hai " + nama + " Total Belanja " + total + " Rp");

        tugas2.close();
    }
}
