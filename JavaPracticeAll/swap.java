import java.util.*;
public class swap {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: \t");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second numer:\t");
        int secondNum = sc.nextInt() ;

        // Before  swapping tow numbers
        System.out.println("\nBefore Swapping:");
        System.out.println("First number is "+ firstNumber);
        System.out.println("Second number is "+ secondNum);

        //  Swapping the number without using third variable
        firstNumber = firstNumber + secondNum;
        secondNum = firstNumber - secondNum;
        firstNumber = firstNumber - secondNum;

        // after Swapping two numbers
        System.out.println("\nAfter Swaffing :");
        System.out.println("First number is\t"+firstNumber);
        System.out.println("Second Number is\t"+secondNum);
        


    }
}
