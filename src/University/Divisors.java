package University;

import java.util.Scanner;

public class Divisors {
    public static void main(String [] args){
        // create a scanner object
        Scanner input =new Scanner(System.in);
        // get input form user console
        System.out.println("Please Enter a number: ");
        int number =input.nextInt();
        // find all divisors using for loop
        for (int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(" "+i);

            }
        }
    }
}
