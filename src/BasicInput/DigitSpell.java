package BasicInput;

import java.util.Scanner;

public class DigitSpell {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter e digit: ");
        int digit=input.nextInt();
        switch (digit){
            case 0:
                System.out.print("Zero");
                break;
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Threee");
                break;
            case 4:
                System.out.print("Fout");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9 :
                System.out.print("Nine");
                break;
            default:
                System.out.print("Please enter a digit!");

        }
    }
}
