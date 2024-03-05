package BasicInput;
import java.util.Scanner;

public class AreaRectengle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter base ");
        double base=input.nextDouble();
        System.out.print("please enter height ");
        double height=input.nextDouble();
        double result=(double)height*base;
        System.out.print("The area is "+result);
    }
}
