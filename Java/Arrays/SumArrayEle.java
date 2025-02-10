// Write a Java Program to Compute the Sum of Array Elements.
// Input: [ 2, 4, 6, 7, 9]
// Output: 28

import java.util.Scanner;

class SumArrayEle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arrLen=sc.nextInt();
        int sum=0;
        System.out.println("Enter the array ele : ");
        int arr[]=new int[arrLen];
        for(int i=0;i<arrLen;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arrLen;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array ele is : "+sum);
        sc.close();
    }
}