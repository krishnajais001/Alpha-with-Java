import java.util.Scanner;

public class binomialCoffecient {

    public static int binomial1(int n){
        int fact=1;
        for (int i = 1; i<=n; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
       System.out.println("Value of n :");
       int n=val.nextInt();
       int n_factorial=binomial1(n);

       System.out.println("Value of r :");
       int r=val.nextInt();
       int r_factorial=binomial1(r);

       int n_r_factorial=binomial1(n-r);
       int bc=n_factorial/(r*n_r_factorial);
       System.out.println("Binomail Coffe."+bc);
       

    }
}
