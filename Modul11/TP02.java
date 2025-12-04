import java.util.Scanner;
import java.util.Arrays;


public class TP02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahPoin = input.nextInt();
        int[] poin = new int[jumlahPoin];

        for (int i = 0; i < jumlahPoin; i++) {
            poin[i] = input.nextInt();
        }

        Arrays.sort(poin); 

        for (int i = jumlahPoin - 1; i >= 0; i--) {
            System.out.print(poin[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}