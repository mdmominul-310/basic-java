package BasicInput;
import java.util.Scanner;
public class BasicInput {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Please Input Any Number");
        number=input.nextInt();
        System.out.println("The input is "+number);
    }
}
