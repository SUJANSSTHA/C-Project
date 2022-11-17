// write a Java Progarm to find the roots of a quadratic equation
import java.util.*;

import javax.annotation.processing.SupportedOptions;
public class SumNum {
public static void main(String[] agrs)
{
    // taking user input of values of coeffinient of a, b, 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value of coefficient a:");
    double a = s.nextDouble();
    System.out.println("Enter tha value of coefficient b:");
    double b = s.nextDouble();
    System.out.println("Enter the value of coefficient c:");
    double c = s.nextDouble();

    // sout --->  System.out.println();
// SupportedOptions
System.out.println();

    // formula
    double D = (a*b)-4*a*c;
    // find the roots 
    if(D>0)
    System.out.println("Roots are" + (-b+Math.sqrt(D))/(2*a)+ "and" + (-b-Math.sqrt(D))/(2*a));
    else if(D==0)
    System.out.println("roots are "+b/(2*a));
    else
    System.out.println("Roots are"+ -b/(2*a)+ "+i" + Math.sqrt(-D)/(2*a)+ "and" + -b/(2*a)+ "-i"+Math.sqrt(-D)/(2*a));

}
    
}
