import java.util.Scanner;

public class TP03 {

    private static double hitungLuas(String bangunDatar, double a, double b) {
        switch (bangunDatar) {
            case "Persegi":
            return a * a;

            case "Persegi Panjang":
            return a * b;

            case "Segitiga":
            return 0.5 * a * b;

            case "Lingkaran":
            return 3.14 * (a / 2) * (a / 2);

            default:
            return 0.0;
        }
    }

    private static double hitungKeliling(String bangunDatar, double a, double b) {
        switch (bangunDatar) {
            case "Persegi":
            return 4 * a;

            case "Persegi Panjang":
            return 2 * (a + b);

            case "Segitiga":
            double sisiMiring = Math.sqrt(a * a + b * b);
            return a + b + sisiMiring;

            case "Lingkaran":
            return 3.14 * a;

            default:
            return 0.0;
        }
    }
    
    
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String bangunDatar = s.nextLine();
        double a = s.nextDouble();
        double b = 0;

        if (bangunDatar.equals("Persegi Panjang") || bangunDatar.equals("Segitiga")) {
            b = s.nextDouble();

        }


        double luas = hitungLuas(bangunDatar, a, b);
        double keliling = hitungKeliling(bangunDatar, a, b);

        if (bangunDatar.equals("Lingkaran")) {
             System.out.printf("%.2f %.2f", luas, keliling);
        }else {
            System.out.println((int)luas + " " + (int)keliling);
        }
    }
}