//Armstrong Number : 1234 (length=4) ---> 1^4+2^4+3^4+4^4 = 354
import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n= sc.nextInt();
        int num = n;
        int length=String.valueOf(n).length();
        int result=0;
        while(n>0){
            int temp=n%10;
            result=result+(int ) Math.pow(temp,length);//?power(temp,length);
            n=n/10;
        }
        System.out.println("Armstromg no for "+num+" is "+result);
        sc.close();
    }
    // public static double power(int no,int length ){
    //     System.out.println(Math.pow(no, length));
    //     return Math.pow(no, length);
    // }
}
