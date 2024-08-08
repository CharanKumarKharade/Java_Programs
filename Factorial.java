//imported java utility package 
import java.util.*;
class Factorial
{
    public static void main(String[] args) {
        //Scanner is  used to accept values from the user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an number");
        // int num=sc.nextInt();
        int num=5; // for testing purpose, you can replace it with any number you want to calculate factorial for.
        // calculating factorial
        System.out.println("Calculating factorial of "+num);

        // using loop to calculate factorial
        // long fact=1; // to avoid overflow for large numbers
        // for (int i=1;i<=num; i++){
        //     fact=fact*i;
        // }
        // System.out.println("Factorial of "+num+" is: "+fact);
        long fact=1;
        for (int i=1;i<=num; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}