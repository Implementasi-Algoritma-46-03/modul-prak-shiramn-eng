import java.util.Scanner;
//testinggg
public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();

        if (angka % 6 == 0) {
            System.out.println("Kelipatan Enam");
        } else {
            System.out.println("Bukan kelipatan enam");
        }

        scanner.close();
    }

public class TP01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int bil = s.nextInt();
        int hasil = bil % 6;
        if (hasil == 0) 
            System.out.println("Kelipatan enam");
        else
            System.out.println("Bukan kelipatan enam");
        }
}

