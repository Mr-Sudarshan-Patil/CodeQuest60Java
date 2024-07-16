import java.util.*;

public class functions{
    public static void printHellofunction(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }


    public static int sumFunction(int num1, int num2){

        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = s.nextInt();
        System.out.println("Enter the value of b: ");
        int b = s.nextInt();

        int sum = sumFunction(a, b);

        System.out.println("Total is : " + sum);


    }
}