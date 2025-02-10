// Remove characters from a string except alphabets.

import java.util.Scanner;

public class OnlyAlphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        System.out.println("String Sfter Removing the Non-Alphabet Charactera : "+str.replaceAll("[^A-Z a-z]", ""));

        sc.close();
    }
}
