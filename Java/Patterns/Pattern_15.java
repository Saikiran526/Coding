// Input Format: N = 3
// Result: 
// A B C
// A B
// A

import java.util.Scanner;
public class Pattern_15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(char j='A';j<'A'+n-i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        sc.close();
    }
}