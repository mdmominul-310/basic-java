package University;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        // create a scanner object
        Scanner input =new Scanner(System.in);
        // Get input from the user
        System.out.println("The a integer number ");
        int number =input.nextInt();

        int flag=0;
        int m=number/2;
        for(int i=2;i<=m;i++){
            if(number%i==0){
                flag=1;
                System.out.println("The given number is not a prime nubmer "+number);
                break;
            }
        }
        if(flag==0){
            System.out.println("the given number is a prime number "+number);
        }
    }
}
