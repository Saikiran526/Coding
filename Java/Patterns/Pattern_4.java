// Input Format: N = 3
// Result: 
// 1
// 2 2 
// 3 3 3


import java.util.Scanner;

public class Pattern_4 {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i+1 +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
