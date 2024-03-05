package BasicInput;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Please Enter Radius of circle ");
        double radius=input.nextDouble();
        double areaOfCirle=(double)3.1416*(radius*radius);
        System.out.print("The result is "+areaOfCirle);
    }
}



