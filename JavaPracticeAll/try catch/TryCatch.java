import java.util.*;
import java.util.Scanner;
public class TryCatch {
     {
      try{ 
   // calculate the interest rate 
   double p = 1000; 
   double t = 2; 
   double r = 5; 
   double interest = (p * t * r) / 100; 

   // display the interest rate 
   System.out.println("The interest rate is: " + interest); 
} 
catch (Exception e) 
{ 
    System.out.println("Error encountered: " + e.getMessage()); 
} 
finally 
{ 
    System.out.println("Finally block executed."); 
}  
    }
}

