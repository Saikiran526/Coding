// Input Format: N = 3
// Result: 
//   *  
//  ***
// ***** 
// *****  
//  ***
//   *  

import java.util.Scanner;
public class Pattern_9 {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
            for(int j=0;j<i*2+1;j++)
                System.out.print("*");
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++)
                System.out.print(" ");
            for(int j=0;j<n*2-i*2-1;j++)
                System.out.print("*");
            for(int j=0;j<i;j++)
                System.out.print(" ");
            System.out.println();
        }
        sc.close();
    }
}
