import java.util.*;

public class patterns{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        

        // Question 1:
            // *
            // **
            // ***
            // ****
            // *****

        // System.out.println("How many lines have you wants in your piramid patterns");
        // int lines = s.nextInt();
        // System.out.println("\n\n=========================================\n\n");

        // System.out.println("OutPut is Here:\t\t\t\n");

        // for(int i=1; i<=lines; i++){
        //        for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //        }
        //        System.out.print("\n");
        // }

        // System.out.println("\n\n=========================================\n\n");
        
        
        
        // Question 2:
            // *****
            // ****
            // ***
            // **
            // *




        // System.out.println("How many lines have you wants in your piramid patterns");
        // int lines = s.nextInt();
        // System.out.println("\n\n=========================================\n\n");

        // System.out.println("OutPut is Here:\t\t\t\n");

        // for(int i=lines; i>=1; i--){
        //        for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //        }
        //        System.out.print("\n");
        // }

        // System.out.println("\n\n=========================================\n\n");
        
        



        // // Question 3:
        // //  1
        // //  12
        // //  123
        // //  1234
        // //  12345

        // System.out.println("Enter the number:\t");
        // int n = s.nextInt();

        // System.out.println("\n\n=======================================");
        // System.out.print("\nOutput is Here:\n\n");
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");
        // }
        
        // System.out.println("\n\n=======================================");



    // Question 4:
        //  A
        //  AB
        //  ABC
        //  ABCD
        //  ABCDE


        System.out.println("Enter the number:\t");
        int n = s.nextInt();
        char ch = 'A';
        System.out.println("\n\n=======================================");
        System.out.print("\nOutput is Here:\n\n");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            System.out.print("\n");
        }
         System.out.println("\n\n=======================================");

    }
}