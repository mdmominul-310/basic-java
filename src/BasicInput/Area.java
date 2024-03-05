package BasicInput;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base");
        double base=input.nextDouble();
        System.out.print("Enter height");
        double height=input.nextDouble();
        double area=(double) 1/2*(base*height);
        System.out.println("The area is "+area);
    }

}
