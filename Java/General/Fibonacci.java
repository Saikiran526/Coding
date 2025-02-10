//Fibonacci Serices

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Numbers do you want : ");
        int n = sc.nextInt();
        sc.close();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i < n - 2; i++) {
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(b+" ");
        }
    }
}