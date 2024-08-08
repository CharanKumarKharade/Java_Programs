import java.util.*;
public class Reverse {
    public static void main(String[]args){
        System.out.println("Enter an number:");
        int number=sc.nextInt();
        int res,div;
        while(number>0){
            div=number%10;
            res=res*10+div;
            number=number/10;
        }
        System.out.println("Reverse of "+number+" is="+res);
    }

}
