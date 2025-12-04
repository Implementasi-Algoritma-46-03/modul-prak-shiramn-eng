import java.util.Scanner;

public class Jurnal02 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine().trim();

        String hasil = kalimat.replaceAll(" +", " ");

        System.out.println(hasil);
    }
}
