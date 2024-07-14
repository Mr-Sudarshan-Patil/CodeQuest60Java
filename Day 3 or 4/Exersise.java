import java.util.Scanner;

public class Exersise{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
    // Question 1: Write a java program to get a numver from the user and print whether it is positive or negativ
    // System.out.print("Enter a number\n");
    // int number = s.nextInt();
    // if(number>=0){
    //     System.out.println("The number is postive");
    // }
    // else{
    //     System.out.println("The number is negative");
    // }




    // Question 2 : Finish the following code so that it prints you hava a fever if your tem is above 100 and otherwise print you dont have a fever


    // double temp = 103.5;

    // if(temp>100){
    //     System.out.println("You hava a fever");
    // }
    // else{
    //     System.out.println("You don't have a fever");
    // }

    // System.out.println("Enter the week number (1-7)");
    // int week = s.nextInt();

    // switch(week){

    //     case 1:
    //         System.out.println("Monday");
    //         break;
    
    //     case 2:
    //         System.out.println("Tueseday");
    //         break;
    
    //     case 3:
    //         System.out.println("Wensday");
    //         break;
    
    //     case 4:
    //         System.out.println("Thursday");
    //         break;
    
    //     case 5:
    //         System.out.println("Friday");
    //         break;
    
    //     case 6:
    //         System.out.println("Saturday");
    //         break;
    
    //     case 7:
    //         System.out.println("Sunday");
    //         break;
    
    //     default:
    //         System.out.println("Invalid input");
    //         break;
    
    // }



    System.out.println("Enter the year : ");
     int year = s.nextInt();
     if (year%4==0){
        System.out.println("Leap year");
     }
     else{
        System.out.println("Not a Leap year");
     }


    }
}