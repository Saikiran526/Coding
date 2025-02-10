import java.util.Scanner;

public class SecondLargAndSmall {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int firstLarge=Integer.MIN_VALUE;
        int secondtLarge=firstLarge-1;
        int firstSmall=Integer.MAX_VALUE;
        int secondLarge=firstSmall-1;
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(firstLarge>arr[i]){
                firstLarge=
            }
        }
        sc.close();
    }
}
