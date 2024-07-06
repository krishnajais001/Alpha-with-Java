import java.util.Scanner;

public class loopGame {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        do {
            
            System.out.print("Enter Number :");
            int num=val.nextInt();
            if (num%10==0) {
                break;
            }
            System.out.println(num);
        } while (true);
    }
}
