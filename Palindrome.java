import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number:");
        int number=sc.nextInt();
        int res=0,div=0,num1=number;
        while(number>0) {
            div = number % 10;
            res = res * 10 + div;
            number = number / 10;
        }
        System.out.println("Reverse of "+number+" is="+res);
        if(num1==res)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
