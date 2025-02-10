// Reverse a string.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        String str1="";
        for(int i=arr.length-1;i>=0;i--){
            str1=str1+arr[i];
        }
        System.out.println("The Reversed Array is : "+str1);
        sc.close();
    }
}
