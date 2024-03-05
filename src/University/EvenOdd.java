package University;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        // create a scanner object
        Scanner input=new Scanner(System.in);
        // get input from user
        System.out.print("Plese inter a integer number");
        int num=input.nextInt();
//        if((num%2)==0){
//            System.out.println("Provided number is Odd: "+num);
//        }else {
//            System.out.println("Provided number is Even: "+num);
//
//        }
        switch (num%2){
            case 0 :
                System.out.println("The is number is Even: ");
                break;
            default:
                System.out.println("the provided number is Odd");
        }
    }
}
