//Find the factorial of a giveb no 

import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("Factorial of the given no : "+fact(n));
        sc.close();
        
    }
    public static int fact(int n){
        if(n==0)
        return 1;
        else{
            return n*fact(n-1);
        }
    }
}


/* Using the java 8 features
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        
        int result = factorial(n);
        
        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of the given number: " + result);
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1; // Return -1 for negative numbers to indicate invalid input
        }
        return IntStream.rangeClosed(1, n)
                        .reduce(1, (a, b) -> a * b); // Using streams and reduce for factorial calculation
    }
}
*/