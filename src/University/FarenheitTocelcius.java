package University;

import java.util.Scanner;

public class FarenheitTocelcius {
    public static void main(String[] args){
        // create a scanner object
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number in Farenheit :");
        double f=input.nextDouble();
        double result=((double)5*(f-32))/9;
        System.out.print("For farenheit "+f +"in celcious "+result);

    }
}
