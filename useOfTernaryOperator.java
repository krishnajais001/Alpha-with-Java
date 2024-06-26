import java.util.Scanner;

public class useOfTernaryOperator {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int marks;
        System.out.print("Enter Marks :");
        marks=val.nextInt();
        String status=marks>=33?"Pass":"Fail";
        System.out.println("Status of Student is : "+status);
    }
}
