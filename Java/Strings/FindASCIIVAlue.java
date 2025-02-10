// Find the ASCII value of a character.

import java.util.Scanner;
public class FindASCIIVAlue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char ch=sc.next().charAt(0);
        System.out.println("ASCII Value for the "+ch+" is : "+(int ) ch);
        sc.close();
    }
}
