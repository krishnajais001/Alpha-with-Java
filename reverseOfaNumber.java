import java.util.*;
public class reverseOfaNumber {
    public static void main(String[] args) {
    
            Scanner val=new Scanner(System.in);
               System.out.print("Enter Number :");
               int num=val.nextInt();
               
               while (num>0) {
                int getLastDigitNumber=num%10;
                System.out.print(getLastDigitNumber);
                int revse= num=num/10;
               }
       
           
    }
}
