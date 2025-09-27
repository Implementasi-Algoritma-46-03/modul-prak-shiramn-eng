// Scanner berfungsi untuk membaca input dari keyboard
import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: nama, jumlah barang, harga per barang
        String nama = input.next();
        int jumlahBarang = input.nextInt();
        int hargaPerBarang = input.nextInt();

        // Hitung total belanja
        int totalBelanja = jumlahBarang * hargaPerBarang;

        // Output sesuai format
        System.out.println("Hi, " + nama + ". Total belanja adalah " + totalBelanja + " rupiah.");

        input.close();
    }
}

/**PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16> cd Modul01
PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> javac TP02.java
E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> java TP02
Dira 5 2000
10000*/