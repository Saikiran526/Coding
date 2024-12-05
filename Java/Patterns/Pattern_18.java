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
            char c=(char)('A'+n-1);
            for(int j=(char)(c-i);j<=c;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
