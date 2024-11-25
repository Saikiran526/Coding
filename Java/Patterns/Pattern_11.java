// Input Format: N = 3
// Result: 
// 1
// 01
// 101


import java.util.Scanner;
public class Pattern_11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                if(i%2!=0){
                    if(j%2!=0)
                    System.out.print("0 ");
                    else 
                    System.out.print("1 ");
                }else{
                    if(j%2==0)
                    System.out.print("0 ");
                    else 
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
