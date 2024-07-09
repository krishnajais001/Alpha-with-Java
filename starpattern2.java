import java.util.Scanner;

public class starpattern2 {
    public static void main(String[] args) {
         Scanner val=new Scanner(System.in);
        System.out.print("Enter Number of Line :");
        int n=val.nextInt();
      for (int line = 1; line <=n; line++) {
        for (int stars = 1; (stars<=n-line+1); stars++) {
        System.out.print("*");
        }
        System.out.println();
    }
    }
}
