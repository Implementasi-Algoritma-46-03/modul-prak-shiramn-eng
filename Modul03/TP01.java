//mengimpor scanner (supaya bisa membaca input dari keyboard)
import java.util.Scanner;

//membuat kelas namanya TP01, harus sesuai sama nama file
public class TP01 {
    public static void main(String[] args) {

        //membuat objek scanner namanya input
        Scanner input = new Scanner(System.in);

        //menginput tiga bagian
        int tabunganAwal = input.nextInt();
        int tabunganHarian = input.nextInt();
        int jumlahHari = input.nextInt();

        //total tabungan itu dari tabungan awal ditambah tabungan harian yang dikali jumlah hari.
        int totalTabungan = tabunganAwal + (tabunganHarian * jumlahHari);
 
        //menampilkan hasil akhir tabungan
        System.out.println(totalTabungan);
        //nutup scanner
        input.close();
    }
}

/*PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16> cd Modul01
PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> javac TP01.java
E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> java TP01
500000 10000 30
800000*/