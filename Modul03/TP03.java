import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPermen = input.nextInt();
        int jumlahTeman = input.nextInt();
        int totalOrang = jumlahTeman + 1;
        int jatahPerOrang = jumlahPermen / totalOrang;
        int sisaPermen = jumlahPermen % totalOrang;
        System.out.println(jatahPerOrang);
        System.out.println(sisaPermen);
        input.close();
    }
}

/**PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16> cd Modul01
PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> javac TP03.java
E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> java TP03
12 3
3
0*/