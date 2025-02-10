//Reverse a number and given no is a palindrome no or not
import java.util.Scanner;
public class ReverseAndPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no :");
        int org=sc.nextInt();
        
        int n=org;
        int revNo=0;
        while(n>0){
            int temp=n%10;
            revNo=revNo*10+temp;
            n=n/10;
        }
        System.out.println("Reversed No : "+revNo);
        if(org==revNo)
        System.out.println("It is a Palindrome No");
        else
        System.out.println("It's not a Palindrome No");
        sc.close();
    }
}
