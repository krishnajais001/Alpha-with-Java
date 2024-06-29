import java.util.Scanner;

public class printSumoffristNaaaaatralNumber {
    public static void main(String[] args) {
          int n;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=val.nextInt();
        int i=1;
        int sum=0;
        while (i<=n) {
            sum=sum+i;
            i++;
            
        }
        System.out.println("Sum of Frist "+n+" Natural Number :"+sum );

    }
}
