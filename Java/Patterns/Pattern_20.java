// Input Format: N = 3
// Result: 
// *    *
// **  **
// ******
// **  **
// *    *


import java.util.Scanner;
public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=2*n-2;
        for(int i=0;i<2*n;i++){
            for(int j=0;j<star;j++)
            System.out.print("*");
            for(int j=0;j<space;j++)
            System.out.print(" ");
            for(int j=0;j<star;j++)
            System.out.print("*");
            if(i<n-1){
                star++;
                space=space-2;
            }else{
                star--;
                space=space+2;
            }
            System.out.println();
        }
        sc.close();
    }
}
