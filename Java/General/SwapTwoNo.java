//Swaping two numbers - Basically it can be achived by 3 ways
class SwapTwoNo{
    public static void main(String args[]){
        System.out.println("Actually values : \na=10\tb=20"+"\n");
        //Way<01> : Using 3 variable
        using3rdVariable(10,20);
        //way<02> : Without using the 3rd variable 
        without3rdVariable(10,20);
        //way<03> : Using bit manipulation
        usingBitManipulation(10,20);

    }
    public static void using3rdVariable(int a,int b){
        int c=a;
        a=b;
        b=c;
        System.out.println("Using 3rd variable : \na="+a+"\tb="+b+"\n");
    }
    public static void without3rdVariable(int a,int b){
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("Without using 3rd variable :\na="+a+"\tb="+b+"\n");

    }
    public static void usingBitManipulation(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Using Bit Manipulations :\na="+a+"\tb="+b+"\n");
    }
}