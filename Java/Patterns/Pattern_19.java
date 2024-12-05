// Input Format: N = 3
// Result: 
// ******
// **  **
// *    *
// *    *
// **  **
// ******


import java.util.Scanner;
public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        int stars=n;
        for(int i=0;i<2*n;i++){
            for(int j=0;j<stars;j++)
            System.out.print("*");
            for(int j=0;j<space;j++)
            System.out.print(" ");
            for(int j=0;j<stars;j++)
            System.out.print("*");
            if (i < n - 1) { 
                stars--;
                space += 2;
            } else if(i==n-1){
                System.out.println();
                continue;
            }else { 
                stars++;
                space -= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
