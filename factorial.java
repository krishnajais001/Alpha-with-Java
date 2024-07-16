import java.util.Scanner;

public class factorial {
    public static int factorial(int n){
        int fact=1;
        for (int i = 1; i<=n; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Value :");
        int n=val.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
}