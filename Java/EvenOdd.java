import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        if(num%2 ==0)
        System.out.println("Its is an Even NUmber");
        else
        System.out.println("Its is an Odd NUmber");
        sc.close();
    }
}


/*Using the java 8 features 
 * import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOddJava8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        // Using Predicate to check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Using Predicate to check if a number is odd
        Predicate<Integer> isOdd = n -> n % 2 != 0;

        // Check if the number is even or odd using the predicates
        if (isEven.test(num)) {
            System.out.println(num + " is an Even Number");
        } else if (isOdd.test(num)) {
            System.out.println(num + " is an Odd Number");
        }
    }
}
 */