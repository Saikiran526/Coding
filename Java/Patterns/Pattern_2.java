// Input Format: N = 3
// Result: 
// * 
// * * 
// * * *

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String argsp[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
