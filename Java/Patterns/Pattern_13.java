// Input Format: N = 3
// Result: 
// 1
// 2 3
// 4 5 6


import java.util.Scanner;

public class Pattern_13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+++" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
