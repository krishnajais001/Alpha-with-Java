import java.util.Scanner;
public class findLarger {
    public static void main(String[] args) {
        int a,b;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter A :");
        a=val.nextInt();
        System.out.print("Enter B :");
        b=val.nextInt();

        if(a>=b){
            System.out.println("Larger Number :"+a);
        }else{
            System.out.println("Larger Number :"+b);
        }

    }
}
