package BasicInput;

import java.util.Scanner;

public class FindVowel {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please in a Char ");
        char word=input.next().charAt(0);

        if(word=='a'){
            System.out.println("This is a vowel "+word);
        } else   if(word=='e'){
            System.out.println("This is a vowel "+word);
        } else   if(word=='i'){
            System.out.println("This is a vowel "+word);
        }else   if(word=='o'){
            System.out.println("This is a vowel "+word);
        }else   if(word=='u'){
            System.out.println("This is a vowel "+word);
        }else{
            System.out.println("This is a Consonant "+word);

        }
    }
}
