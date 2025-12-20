import java.util.Scanner;

public class Jurnal03 {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in); 

        int a = scan.nextInt(); 
        String[] b = new String[a]; 

        // isi array dengan input user
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.next().trim();
        }

        // kata yang mau dicari
        String c = scan.next().trim();


        
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                
                if (b[j].compareToIgnoreCase(b[j + 1]) > 0) {
                    
                    String temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }


        int left = 0;
        int right = b.length - 1;
        int foundIndex = -1; 

        while (left <= right) {
            int mid = (left + right) / 2; 

            
            int compare = b[mid].compareToIgnoreCase(c);

            if (compare == 0) { 
                foundIndex = mid; 
                break;
            } else if (compare < 0) {
                
                left = mid + 1;
            } else {
                
                right = mid - 1;
            }
        }

        
        if (foundIndex != -1) { 
            System.out.printf("Ditemukan di indeks ke-%d", foundIndex + 1); 
        } else {
            System.out.print("Data tidak ditemukan"); 
        }

        scan.close(); 
    }
}