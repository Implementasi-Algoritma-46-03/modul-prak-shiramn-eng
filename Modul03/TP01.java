import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tabunganAwal = input.nextInt();
        int tabunganHarian = input.nextInt();
        int jumlahHari = input.nextInt();
        int totalTabungan = tabunganAwal + (tabunganHarian * jumlahHari);
        System.out.println(totalTabungan);
        input.close();
    }
}

/*PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16> cd Modul01
PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> javac TP01.java
E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> java TP01
500000 10000 30
800000*/