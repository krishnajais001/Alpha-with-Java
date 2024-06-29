   import java.util.Scanner;
   public class printhelloworld100times {
    public static void main(String[] args) {
        int n;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=val.nextInt();
        int i=0;
        while (i<=100) {
            System.out.println("Hello World !");
            i=i+1;
        }
        System.out.println(+n +" Times Printed");
    }
   }