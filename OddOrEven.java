import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        //Input value from User
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an number:");
        int num=scanner.nextInt();
        //Asking user to enter value 
        // int number = 5;
        if (num%2==0)
        System.out.println(num+" is an even number");
        else
        System.out.println(num+" is an odd number");
    }
}
