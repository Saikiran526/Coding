// Input Format: N = 3
// Result: 
// A
// A B
// A B C

import java.util.Scanner;
public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        
        sc.close();
    }
}
