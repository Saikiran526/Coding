// Example 1:
// Input: N = 3
// Output: 
// * * *
// * * *
// * * *

import java.util.Scanner; 
class Pattern_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}