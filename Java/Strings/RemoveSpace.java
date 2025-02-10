import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = sc.nextLine();
        System.out.println("String After removing all Vowels : " + str.replaceAll(" ", ""));
        sc.close();
    }
}
