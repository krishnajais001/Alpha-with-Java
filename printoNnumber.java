import java.util.Scanner;

public class printoNnumber {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int n;
        System.out.print("Emter Number :");
        n=val.nextInt();
        int i=0;
        while (i<=n) {
            System.out.println(i);
            i++;
        }
    }
}
