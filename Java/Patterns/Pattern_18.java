// Input Format: N = 3
// Result: 
// C
// B C
// A B C


import java.util.Scanner;
public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            char c=(char)('A'+n-1-i);
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
            // System.out.println((char)('A'+n-1));
        }
        sc.close();
    }
}
