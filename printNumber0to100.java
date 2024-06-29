import java.util.Scanner;

public class printNumber0to100 {
    public static void main(String[] args) {
        int n;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=val.nextInt();
        int i=0;
        System.out.println("Natural Numbers upto :"+n);
        while (i<=n) {
           
            System.out.println(i);
            i++;
        }
    }
}
