import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        double na = (0.25 * p) + (0.35 * a) + (0.4 * b);

        System.out.printf("%.2f%n", na);
        System.out.println("Lulus MK: " + (na >= 75));

        input.close();
    }
        int P = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();

        double NA = (0.25 * P) + (0.35 * A) + (0.40 * B);

        Boolean lulus = NA >= 75;

        System.out.printf("%.2f\n", NA);
        System.out.println("Lulus MK: " + lulus);

 
}
}
