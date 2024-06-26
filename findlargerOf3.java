import java.util.Scanner;
public class findlargerOf3 {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter A :");
        a=val.nextInt();
        System.out.print("Enter B :");
        b=val.nextInt();
        System.out.print("Enter C :");
        c=val.nextInt();
        if ((a>b) && (a>c)) {
            System.out.println("A is Larger");
        }else if (b>c){
            System.out.println("B is Larger");
        }else{
            System.out.println("C is Larger");
        }
    }
}
