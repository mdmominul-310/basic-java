package University;

public class PrimeNumberTable {
    public static void main(String[] args){
        for(int i=2;i<=100;i++){
            int prime =getPrimeNumber(i);
            if(prime!=0){
                System.out.print(prime +" ");
            }
        }
    }


    // create a mehthod for finding prime number
    public static int getPrimeNumber(int n){
        int number=n;
        int m=number/2;
        boolean flag=true;
        // start loop for finding prime number
        for(int i=2;i<=m;i++){
            if(number%i==0){
                flag=false;
            }
        }
        //when flag ture print the number
        if(flag){
           return number;
        }
        return 0;
    }
}
