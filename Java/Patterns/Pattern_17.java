// Input Format: N = 3
// Result: 
//   A  
//  ABA 
// ABCBA


import java.util.Scanner;
public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++)
            System.out.print(" ");
            char c='A';
            int mid=(2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(c);
                if(j<=mid-1) c++;
                else c--;
            }
            System.out.println();
        }
        sc.close();
    }
}
