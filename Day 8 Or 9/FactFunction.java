import java.util.Scanner;
public class FactFunction{
    public static int FactFunction(int num){
        // int fact = num;
        int t=1;
        for(int i=1; i<=num; i++){
            // fact = fact * (num - i);
            t = t*i;
        }

        return t;
    }


    public static int binCoeff(int num, int r){
        int n_fact = FactFunction(num);
        int r_Fact = FactFunction(r);
        int nmr_Fact = FactFunction(num-r);

        int ncr = n_fact / (r_Fact * nmr_Fact);
        return ncr;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of n: " );
        int num=s.nextInt();
        System.out.println("Enter the number of r: " );
        int r=s.nextInt();


        int ncr = binCoeff(num, r);

        System.out.println("Binomial Coefficient is: " + ncr);
        // System.out.println("Factorial is: " + " "+ FactFunction(num));
    }
}