// Write a Java Program to Find the Largest Element in Array
// Input: [ 7, 2, 5, 1, 4]
// Output: 7

import java.util.Scanner;

public class LargEleInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>largest)
            largest=arr[i];
        }
        System.out.println(largest);
        sc.close();
    }
}
