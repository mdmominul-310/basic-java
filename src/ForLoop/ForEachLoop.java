package ForLoop;


import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] num=new int[4];
        for(int i=0;i<num.length;i++){
num[i]=input.nextInt();
        };
       for(int serial:num){
           System.out.println("The number is: "+serial);
       };
    }
}
