import java.util.*;
public class ExceptionHandling {
    public static void main(String [] args ){
        System.out.println("Enter an number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt(),i;
        try{
            for(i=10;i>=0;i-=2){
                System.out.println(number/i);
            }
        }
        catch(ArithmeticException error){
            System.out.println("Error:"+error.getMessage());
        }
        finally{
            System.out.println("Ended the program by skipping the divisibility by 0");
        }
    }
}
