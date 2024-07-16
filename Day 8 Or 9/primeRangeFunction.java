import java.util.*;

public class primeRangeFunction{
    
    public static boolean primeFunction(int n){
        boolean isPrime= true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime=false;
            }
        }

        return isPrime;
    }


    public static void main(String args[]){
        int num = 30;
        for(int i=2; i<=num; i++){
            boolean isPrime=primeFunction(i);
            if(isPrime==true){
                System.out.println(i);
            }
        }
    }
}