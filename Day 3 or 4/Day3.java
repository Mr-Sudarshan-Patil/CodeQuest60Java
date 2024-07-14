import java.util.*;

public class Day3 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        // Binary Operators  + , - ,  * , / , %  Binary operators means we wants to components 
        // int a = s.nextInt();
        // int b = s.nextInt();
        // int sum = a+b;

     
        // System.out.print("Total is : " + sum);

        // Unary Operators ++ , --   // it only wants single component

        // int c = 5;
        // int d= ++c;

        // System.out.println("C : "+ c);
        // System.out.println("d : "+ d);

        // C : 6
        // d : 6

        // int c = 5;
        // int d= c++;

        // System.out.println("C : "+ c);
        // System.out.println("d : "+ d);


        // int a = 2 ;
        // System.out.println(a--);
        // // System.out.println(a++);

        // System.out.print("Enter the number");
        // int age = s.nextInt();
        // if(age>18){
        //     System.out.println("You are eligible for voting!");
        // }
        // else{
        //     System.out.println("You are not eligible for voting!");
        // }



        // Print a largest Number 

        // A=5, B=25


        // int A=5;
        // int B=25;

        // if(A>B){
        //     System.out.print("A is larger than B");
        // }
        // else{
        //     System.out.print("B is larger than A");
        // }



        // // Odd or even
        // System.out.print("Enter the number \n");
        // int number = s.nextInt();

        // if(number%2==0){
        //     System.out.print("The number is even");
        // }
        // else{
        //     System.out.print("The number is odd");
        // }



        // Income Tax Calculator
        // System.out.print("Enter your income in Lacks");
        // int income = s.nextInt();
        // int tax;

        // if(income<=500000){
        //     tax = 0;

        // }
        // else if(income>500000 && income <=1000000){
        //     tax = (int)(income * 0.2);
        // }
        // else{
        //     tax = (int)(income * 0.3);
        // }
        // System.out.println("Your tax is : " + tax);



        // Find the 3 of largest number


        // int A=500;
        // int B=67;
        // int C=35;


        // if (A>B && A>C){
        //     System.out.println("A is greater");
        // }
        // else if(B>A && B>C){
        //     System.out.println("B is greater");
        // }
        // else{
        //     System.out.println("C is greater");
        // }



        // Ternary Operator

        // String type = (5%2==0)? "Even" : "Odd";

        // System.out.print(type);


// Example 2 check student pass or not if greater that 33 marks then student will be passed
        // int marks = 23;
        // String marksStatus = (marks > 33) ? "Pass" : "Fail";
        // System.out.print(marksStatus);




        // Switch Statement
        // System.out.print("Enter the number between 1 to 3   ");
        // int number = s.nextInt();

        // switch (number) {
        //     case 1 : System.out.println("Mangos");     
        //                 break;
        //     case 2 : System.out.println("American Dry Fruit");
        //                 break;
        //     case 3 : System.out.println("Samosa");
        //                 break;
        //     default : System.out.println("Bhai tu sapna dekha raha hai abhi tu utha ja");
        //                 break;
        // }






        // Make a Calculator using the swithc case


        System.out.println("Addition Click '1' \n Multiplication Click '2' \n Substraction Click '3'");
        int number = s.nextInt();

        switch(number){

            case 1:
                System.out.print("Entert the two numbers for the addition");
                int a = s.nextInt();
                int b = s.nextInt();
                int sum = a+b;
                System.out.print("The total is : "+ sum);
                break;

            case 2:
                System.out.print("Entert the two numbers for the multiplication");
                int c = s.nextInt();
                int d = s.nextInt();
                int mul = c*d;
                System.out.print("Multiplication is: "+ mul);
                break;

            case 3:
                System.out.print("Entert the two numbers for the Substraction");
                int e = s.nextInt();
                int f = s.nextInt();
                int sub = e-f;
                System.out.print("Substraction is: "+ sub);
                break;

            default: 
                System.out.print("Invalid Input");
                break;
        }

    }
}