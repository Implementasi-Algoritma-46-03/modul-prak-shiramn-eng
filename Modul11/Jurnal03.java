import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Jurnal03 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();

        while (true) {
            int x = input.nextInt();
            if (x == -1) {
                break;
            }
            data.add(x);
        }

        Collections.sort(data);

        int modus = data.get(0);
        int frekuensiMax = 1;
        int hitung = 1;

        for (int i = 1; i < data.size(); i++) {
            if (data.get(i).equals(data.get(i - 1))) {
                hitung++;
            } else {
                hitung = 1;
            }

            if (hitung > frekuensiMax) {
                frekuensiMax = hitung;
                modus = data.get(i);
            } else if (hitung == frekuensiMax && data.get(i) > modus) {
                modus = data.get(i);
            }
        }

        System.out.println(modus);
    }
}