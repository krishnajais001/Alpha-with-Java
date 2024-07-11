import java.util.Scanner;

public class function4 {
    public static int product(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=val.nextInt();
        System.out.println("Enter B :");
        int b=val.nextInt();
        int prod=product(a, b);
        System.out.println("Product is :"+prod);
    }
}
