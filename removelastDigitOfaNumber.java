import java.util.Scanner;

public class removelastDigitOfaNumber {
    public static void main(String[] args) {
     Scanner val=new Scanner(System.in);
        System.out.print("Enter Number :");
        int num=val.nextInt();
        int remove_Last_digit=num/10;
        System.out.println("lastdigit :"+remove_Last_digit);


    }
    
}