import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        if (n % 6 == 0)
        System.out.println("Kelipatan enam");

        else
        System.out.println("Bukan kelipatan enam");

    }
}
