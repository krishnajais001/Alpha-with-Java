import java.util.Scanner;

public class printPattern {
    public static void main(String[] args) {
        int n;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=val.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(" * * * * ");
            i++;
        }
    }
}
