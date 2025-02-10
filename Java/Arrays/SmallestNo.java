// Find the smallest number in an array
import java.util.Scanner;

public class SmallestNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<smallest)
            smallest=arr[i];
        }
        System.out.println(smallest);
        sc.close();
    }
}
