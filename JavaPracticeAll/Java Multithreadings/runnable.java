/*how many way to create thread
 * by extending Thread class
 * by implementing Runnable class
 * 
 * 
 * this program discuess runnable thread
 */

class A implements Runnable{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("My child Thread");
        }

    }
}
public class runnable {
    public static void main(String []args){
        A ru= new A();
        
        // Thread t = new Thread(ru);
        // ru = object reference
        Thread t = new Thread(ru);
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
