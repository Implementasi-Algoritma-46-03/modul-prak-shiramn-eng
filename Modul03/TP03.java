import java.util.Scanner;
public class TP03 {

    public static void main(final String[] args) {
        // TP03
        Scanner tugas3 = new Scanner(System.in);

        int n = tugas3.nextInt();
        int t = tugas3.nextInt();

        int total = t + 1;

        int orang = n / total;
        int permen = n % orang;

        System.out.println(permen);

        tugas3.close();
    }
}