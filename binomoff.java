public class binomoff {
    public static int factorial(int n){
        int fact=1;
        for (int i = 1; i<=n; i++) {
            fact=fact*i;
        }
        return fact;
    }

    public static int binoCoffe(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binoCoffe=fact_n/(fact_r*fact_nmr);
        return binoCoffe;
    }

    public static void main(String[] args) {
        System.out.println("Binomial Coffecient :"+binoCoffe(4, 2));
    }
}
