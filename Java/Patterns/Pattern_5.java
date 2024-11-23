// Input Format: N = 3
// Result: 
// * * *
// * * 
// *

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
