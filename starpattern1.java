import java.util.Scanner;

public class starpattern1 {

    public static void main(String[] args) {
      Scanner val=new Scanner(System.in);
        System.out.print("Enter Number of Line :");
        int n=val.nextInt();
      for (int line = 1; line <=n; line++) {
        for (int times = 1; times<=line; times++) {
        System.out.print("*");
        }
        System.out.println();
    }
    }
}