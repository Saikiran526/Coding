
// Check if a given string is palindrome or not.
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the String : ");
        String str = sc.nextLine();
        sc.close();

        int start = 0;
        int end = str.length()-1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)){
                System.out.println("It's not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("It's a Palindrome");
    }
}
