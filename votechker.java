import java.util.Scanner;

public class votechker {
    public static void main(String[] args) {
     int age;
    Scanner val=new Scanner(System.in);
    System.out.print("Enter Age :");
    age=val.nextInt();

    if (age>=18) {
        System.out.println("Adult's");
    }else{
        System.out.println("You Can't Vote");
    }

    }
}
