import java.util.Scanner;

public class getLastDigitNumber{
    public static void main(String[] args) {
     Scanner val=new Scanner(System.in);
        System.out.print("Enter Number :");
        int num=val.nextInt();
        int lastdigit=num%10;
        System.out.println("lastdigit :"+lastdigit);


    }
}