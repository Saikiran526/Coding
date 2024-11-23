import java.util.Scanner;

public class Pattern_7 {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // for (int j = 0; j<n-i; j++) {
               //for apace 
               for(int space=0;space<n-i-1;space++){
                System.out.print(" ");
               }
               //for *
               for(int star=0;star<2*i+1;star++){
                System.out.print("*");
               }
               //for apace 
               for(int space=0;space<n-i-1;space++){
                System.out.print(" ");
               }
            
            System.out.println();
        }
        sc.close();
    }    
}
