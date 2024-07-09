import java.util.Scanner;

public class halfpyramidpattern {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Number of Lines :");
        int n=val.nextInt();
        for (int line = 0; line <= n; line ++) {
            for (int Num = 1; Num <=line; Num++) {
                System.out.print(Num);

            }
            System.out.println();
        }
    }
}
