import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String namaHari = input.nextLine().trim().toLowerCase();
        int bilangan = input.nextInt();

        int hari = -1;
        switch (namaHari) {
            case "senin": hari = 0; break;
            case "selasa": hari = 1; break;
            case "rabu": hari = 2; break;
            case "kamis": hari = 3; break;
            case "jumat": hari = 4; break;
            case "jum'at": hari = 4; break;
            case "sabtu": hari = 5; break;
            case "minggu": hari = 6; break;
            default:
                System.out.println("Nama Hari Tidak Valid");
                input.close();
                return;
        }

        int step = ((bilangan % 7) + 7) % 7;
        int hasilIndex = (hari + step) % 7;

        String hasilHari = "";
        switch (hasilIndex) {
            case 0: hasilHari = "Senin"; break;
            case 1: hasilHari = "Selasa"; break;
            case 2: hasilHari = "Rabu"; break;
            case 3: hasilHari = "Kamis"; break;
            case 4: hasilHari = "Jum'at"; break;
            case 5: hasilHari = "Sabtu"; break;
            case 6: hasilHari = "Minggu"; break;
        }

    }
}