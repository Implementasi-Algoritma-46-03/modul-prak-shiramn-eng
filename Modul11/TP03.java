import java.util.Scanner;

public class TP03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();
        kalimat = kalimat.trim(); // hapus spasi depan-belakang

        if (kalimat.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] kata = kalimat.split(" +"); // 1 atau lebih spasi
        System.out.println(kata.length);
    }
}