// Input Format: N = 3
// Result: 
// 1    1
// 12  21
// 123321

import java.util.Scanner;
public class Pattern_12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=2*(n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
            System.out.print(j);
            for(int j = 1;j<=spaces;j++)
            System.out.print(" ");
            for(int j=i;j>=0;j--)
            System.out.print(j);
            System.out.println();
            spaces-=2;
        }
        sc.close();
    }
}
