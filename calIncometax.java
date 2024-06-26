import java.util.Scanner;
public class calIncometax {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int income,Tax;
        System.out.print("Enter Your Income :");
        income=val.nextInt();
        if (income<=500000) {
          //  System.out.println("No Tax Amount Less than equal to 500000");
          Tax=0;
        }else if (income<=1000000) {
           // System.out.println("Tax is "+(income*0.2));
           Tax=(int)(income*0.2);
            
        }else{
            // System.out.println("Tax is :"+(income*0.3));
            Tax=(int)(income*0.3);
        }
        System.out.println("Tax is :"+Tax);
    }
}
