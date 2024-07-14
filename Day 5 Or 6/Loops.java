import java.util.Scanner;

public class Loops{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        // int counter =0;

        // while(counter<100){
        //     System.out.println("Hello World!");
        //     counter++;
        // }

        // System.out.println("Hello world printed 100 times!");


        // Print 1 to 10

        // int no=1;

        // while(no<=10){
        //     System.out.print(no + " ");
        //     no++;
        // }



        // Print number from 1 to n

        // n=7


        // int n=7;
        // int i=1;

        // while(i<=n){
        //     System.out.print(i + " ");
        //     i++;
        // }

        // Print sum of first n natural numbers
        // n=5

        // int i=1;
        // int n=5;
        // int count=0;
        // while(i<=n){
        //     count = count + i;
        //     i++;
        // }

        // System.out.println("Total count is: "+ " " + count);





        // For Loop

        // for(int i=1; i<=3; i++){
        //     System.out.println("Hello World");
        // }
        // System.out.println("Printed 3times");


        // for(int i=1; i<=10; i++){
        //     System.out.print(i + " ");
        // }

        // int n=5;
        // int sum=0;
        // for(int i=1; i<=n; i++){
        //     sum=sum+i;
        // }

        // System.out.print("Total is :" + " " + sum);

        // int n = 4;

        // for(int i=1; i<=4 ; i++){
        //     System.out.println("****");
        // }


        // int n = 4;

        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=4; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }


        // Print reverse of a number

        // for(int i=10; i>=1; i--){
        //     System.out.println(i);
        // }



        // Print revers of a number

        // n=040699   ==>   996040

    //     int n = 4699;
    //     while(n>0){
    //         int lastDigit = n%10;
    //         System.out.print(lastDigit + " ");
    //         n = n/10;
    //     }

    // System.out.println();


    // Reverse the given number

    //  int n = 4699;
    //  int rev =0;
    //     while(n>0){
    //         int lastDigit = n%10;
    //         rev = (rev*10) + lastDigit;
    //         n = n/10;
    //     }


    // System.out.println(rev);



// Do While Loop


// int counter=1;
// do{
//     System.out.println("Hello World");
//     counter++;
// }while(counter<=0);


// Break Statement

// to exit the loop




// while(true){
//     System.out.println("Enter the number");
//     int number= s.nextInt();
//     if(number%10==0){
//         System.out.println("This number is divisible by 10 that why this loop will exit");
//         break;
//     }else{
//         System.out.println("The number is : "+ number);
//     }
// }



// Continue Statement
// To skip an iteration : Print 1 to 10 and skip 3 



// for(int i=1; i<=10; i++){
//     if(i==3){
//         continue;
//     }
//     System.out.println(i);
// }



// while(true){
//     System.out.print("Enter the number \t");
//     int number= s.nextInt();

//     if(number%10==0){
//         System.out.println("Skip");
//         continue;
//     }
//     System.out.println("The number is \t" + number);
// }




// System.out.println("Enter the number");
// int number = s.nextInt();

// int count = 0;

// for(int i=1; i<=number; i++){
//     if(number%i==0){
//         count++;
//     }
// }

// if(count==1){
//     System.out.println("1 Nor Prime Number");
// }else if(count==2){
//     System.out.println("Prime Number");
// }
// else{
//     System.out.println("Not a Prime Number");
// }




// ============================{Second way or prime number to solve it}=========================================
// System.out.println("Enter the number");
// int number=s.nextInt();
// boolean isPrime=true;
// for(int i=2; i<=number-1; i++){
//     if(number%i==0){
//         isPrime=false;
//     }
// }

// if(number==1){
//     System.out.println("1 is not prime or composite");
//     }
// else if(isPrime==true){
//     System.out.println("Prime number");
// }
// else{
//     System.out.println("Not a prime number");
// }



// for(int i=0; i<5; i++){
//     System.out.println("=============================================");
//     System.out.println(i);
//     System.out.println(i++);
//     System.out.println("Hello");
//     i+=2;
//     System.out.println(i);
//     System.out.println("=============================================");
// }



// // Question 2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.


// int evenCount=0;
// int oddCount=0;
// int number;
// int choise;

// do{

// System.out.println("Enter the number\t");
// number = s.nextInt();

// if(number%2==0){
//     evenCount++;
// }
// else{
//     oddCount++;
// }

// System.out.println("For continue, Press 1");
// choise = s.nextInt();
// }while(choise == 1);

// System.out.println("Event numbers: "+" "+evenCount);
// System.out.println("Odd numbers: "+" "+oddCount);



// Question 3 :Write a program to find the factorialof any number entered by the user.(Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly. We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same).


// System.out.println("Enter the number: ");
// int number = s.nextInt();
// int fact = number;


//     for(int i=1; i<number; i++)
//     {

//        fact = fact * (number - i);
    
//     }


// System.out.println("Factorial number is :" + fact);




// Question4: Write a program to print the multiplication table of a number N,entered by the user.

// System.out.println("Enter the number:");
// int n = s.nextInt();

// for(int i=1; i<=10; i++){
//     System.out.println(n+"x"+i+"=" + n*i);
// }







    }
}