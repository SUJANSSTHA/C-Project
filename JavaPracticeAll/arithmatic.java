// Write a menu drive program to calculate addition, subtraction multiplication and dicision of two numbers.
// add
// sub
//  mul
// divide
// Exit (hind dowhile and switch)

import java.util.*;

import javax.swing.text.AbstractDocument.BranchElement;
public class arithmatic {
    public static void main (String[]args)
    {   
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Enter Your choice between 1 and 5");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: 
                System.out.println(" \nEnter First Number:");
                int a = sc.nextInt();
                System.out.println("\n Enter Second Number:");
                int b = sc.nextInt();
                int c = a+b;
                System.out.println("\n Sum a+b is = "+c);
                break;
                
                case 2:
                System.out.println("Enter First Number:");
                a = sc.nextInt();
                System.out.println("Enter second+ Number:");
                b = sc.nextInt();
                c = a-b;
                System.out.println("\n Sub a-b is = "+c);
                break;
                case 3:
                System.out.println("Enter first Number:");
                a = sc.nextInt();
                System.out.println("Enter Second number:");
                b = sc.nextInt();
                c = a*b;
                System.out.println("Mul Number is:"+c);
                break;
                case 4:
                System.out.println("Enter First Number:");
                a = sc.nextInt();
                System.out.println("Enter Second Number:");
                b = sc.nextInt();
                c = a/b;
                System.out.println("Divide Number is :"+c);
            }
        }while(true);

    }
    
}
