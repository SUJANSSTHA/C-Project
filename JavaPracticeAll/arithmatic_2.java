// Write a menu drive program to calculate addition, subtraction multiplication and dicision of two numbers.
// add
// sub
//  mul
// divide
// Exit (hind dowhile and switch)

import java.util.*;
public class arithmatic_2 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter  First number:\t");
            int a = sc.nextInt();
            System.out.println("Enter Second number");
            int b = sc.nextInt();


            System.out.println("plz choose the number");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("-------------");
        
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: 
                int c = a+b;
                System.out.println("Sum is a+b\t"+c);
                break;
                case 2: 
                 c = a-b;
                System.out.println("Sub is a-b\t"+c);
                break;
                case 3: 
                 c = a*b;
                System.out.println("Mul is a*b\t"+c);
                break;
                case 4: 
                 c = a/b;
                System.out.println("div is a/b\t"+c);
                break;
                case 5: 
               System.exit(0);
               default:
               System.out.println("Invalid Number You have Enter. Plz enter number between 1 and 5");
            }

        }while(true);
    }
}
