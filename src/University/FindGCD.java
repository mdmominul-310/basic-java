package University;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);
        // get  input form user for number one
        System.out.print("Enter Frist number: ");
        int num1= input.nextInt();
        System.out.print("Enter second number");
        int num2= input.nextInt();

        // get result
        int result =gcd(num1,num2);
        System.out.println("The gretest number is : "+result);
    }

    // method for finding gcd
    public static int gcd(int n1,int n2){
        int g=1;
        int k=2;
        while (k<=n1&&k<=n2){
            if(n1%k==0&&n2%k==0) g=k;
            k++;
        }
        return g;
    }

}
