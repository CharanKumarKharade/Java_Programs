import java.util.*;
public class Fibonacci {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number to find the fibonacci sequence from 0-n digits:");
        int num=sc.nextInt();
        int num1=0,num2=1,i=2;
        System.out.print(num1+" "+num2+" ");
        do{
            int num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
            i++;
        }while(i<num);
        System.out.println("\n End of Fibonacci Series");
    }
}
