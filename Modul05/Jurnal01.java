import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeMenu = input.nextInt();
        int jumlahPesanan = input.nextInt();

        String menu = "";
        int harga = 0;
        switch (kodeMenu){
            case 1:
            menu = "Nasi Goreng";
            harga = 15000 / 1000;
            break;

            case 2:
            menu = "Mie Goreng / Nyemek";
            harga = 18000 / 1000;
            break;

            case 3:
            menu = "Kwetiau Goreng / Nyemek";
            harga = 20000 / 1000;
            break;

            case 4:
            menu = "Capcay Goreng / Kuah";
            harga = 23000 / 1000;
            break;
            default:
            System.out.println("kode menu tidak valid");
        }
        int total = jumlahPesanan * harga;

        System.out.print(menu + " " + jumlahPesanan + " buah, " + "total harga Rp. " + total + ".000");
    }
}
