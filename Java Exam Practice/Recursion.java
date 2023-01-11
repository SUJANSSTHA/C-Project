/*Recursion 
 recursion is a process by which a function called itself repeatedly until some conditon has been satisfied.
 to be recursion two condition must be sertified 
 first the problem much be written in Recurion from 
 second the problem much include the stopping condition.
 */
//  Factorinal of a number using recurion

class Factroials{
    int fact(int n)
    {
        int result;
        if(n==1)
        {
        return 1;

        }
        result = fact(n-1)*n;
        return result;

    }
}

public class Recursion {
    public static void main (String args[])
    {
        Factroials fas = new Factroials();
        System.out.println("factorian of 1 is "+fas.fact(1));
        System.out.println("factorian of 2 is "+fas.fact(2));
        System.out.println("factorian of 3 is "+fas.fact(3));
        System.out.println("factorian of 4 is "+fas.fact(4));
        System.out.println("factorian of 5 is "+fas.fact(5));
        System.out.println("factorian of 6 is "+fas.fact(6));
        System.out.println("factorian of 7 is "+fas.fact(7));
    }
    
}
