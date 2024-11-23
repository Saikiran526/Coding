// Input Format: N = 3
// Result: 
// 1 2 3
// 1 2
// 1

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n-i; j++) {
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
