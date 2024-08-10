//Buzz number is a number that is either divisible by 7 or ends with 7
import java.util.*;
public class BuzzNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number");
        int number=sc.nextInt();
        System.out.println((number%10==7 || number/7==0) ? "Buzz Number" :"Not an Buzz Number" );
    }
}
