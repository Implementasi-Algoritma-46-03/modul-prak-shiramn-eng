import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String[] b = new String[a];

        for (int i = 0; i < b.length; i++) { 
            b[i]= scan.next().trim(); 
        }

        for (int i = 0; i < b.length; i++) {
            String key = b[i]; 
            int j = i - 1; 

            while(j >= 0 && b[j].compareToIgnoreCase(key) > 0){ 
                b[j + 1] = b[j]; 
                j -= 1;
            }

            b[j + 1] = key;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.printf("%s ", b[i]);
        }

        scan.close();
    }
}