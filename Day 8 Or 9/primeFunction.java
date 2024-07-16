import java.util.*;
public class primeFunction{

    // public static boolean PrimeFuncition(int num){
    //     boolean isPrime = true;
    //     for(int i=2; i<=num-1; i++){
    //         if(num%i==0){
    //             isPrime = false;
    //         }
    //     }
    //     return isPrime;
    // }


    //Optimize prime function


    public static boolean PrimeFuncition(int n){
        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        boolean isPrime = PrimeFuncition(num);


        if(isPrime==true){
            System.out.println("Prime No");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
}