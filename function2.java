import java.util.Scanner;

public class function2 {
    public static int caCulateSum(int a,int b){ // parameter or formal parameter
        int sum=a+b; 
        return sum;
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Value of A :");
        int a=val.nextInt();
        System.out.print("Enter Value of B :");
        int b=val.nextInt();
       int sum= caCulateSum(a,b); // arguments
       System.out.println("Sum of "+a+" & "+b+" : "+sum);
    }
}
