import java.util.Scanner;;
public class prac1 {
    public static void main(String[] args) {
        double a,b;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Value of A :");
        a=val.nextDouble();
        System.out.print("Enter Value of B :");
        b=val.nextDouble();
        System.out.println("Sum of A & B :"+(a+b));
        System.out.println("Sub of A & B :"+(a-b));
        System.out.println("Mul of A & B :"+(a*b));
        System.out.println("Div of A & B :"+(a/b));
        System.out.println("Rem of A & B :"+(a%b));
    }
}