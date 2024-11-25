// Input Format: N = 3
// Result: 
//   *  
//   **
//   ***  
//   **
//   *  


import java.util.Scanner;
public class Pattern_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=2*n;i++){
            int stars=i;
            if(i>n)
            stars=2*n-i;
            for(int j=0;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=0;i<n-1;i++){
        //     for(int j=n-i-1;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
