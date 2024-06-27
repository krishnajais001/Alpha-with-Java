import java.util.Scanner;

public class print100Hw {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int n;
        System.out.print("Enter How many Times You Want :");
        n=val.nextInt();
        int i=0;
        while (i<=n) {
            System.out.println("Hello World");
            i++;
        }
        System.out.println("100 Times Printed ");
    }
}