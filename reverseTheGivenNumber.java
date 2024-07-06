import java.util.Scanner;

public class reverseTheGivenNumber {
    public static void main(String[] args) {
        
            Scanner val=new Scanner(System.in);
               System.out.print("Enter Number :");
               int num=val.nextInt();
               int rev=0;
               while (num>0) {
                int getLastDigitNumber=num%10;
                 rev=(rev*10)+getLastDigitNumber;
                 num=num/10;
               }
               System.out.println("Reversed Number :"+rev);
    }
}
