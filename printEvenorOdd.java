import java.net.Socket;
import java.util.Scanner;

public class printEvenorOdd {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int n;
        System.out.print("Enter Number :");
        n=val.nextInt();
        if (n%2==0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
        
    }
}
