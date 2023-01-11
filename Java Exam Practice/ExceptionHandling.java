/* Exception handling is one of the most powerful mechanism to handle the run time errors so that the normal flow of the application can be maintained 
 * try block
 * the try block contains set of statements where an execution can occur.
 * Catch block
 * A catch block is where you handle the exceptions this block must follow the try block.
*/

public class ExceptionHandling {
    public static void main(String args[])
    {
        System.out.println("Main method Started");
        int a= 10, b=0, c;
        try{
            c = b/a;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("cant divided by zero");
        }
        System.out.println("main method ended");
    }
}
