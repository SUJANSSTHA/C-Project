import javax.sound.sampled.SourceDataLine;
/*
what is thread ?
thread is a pre-define class in java which is available in java.lang package.
thread is a basic unit of cpu it is well known for independent exetution.
 */

class A extends Thread{
    // @Override
    public void fun(){
        try{

       
        for(int i=1;i<=5;i++)
        {
            System.out.println("Sujan Pradhan");
            Thread.sleep(1000);
        }
    }catch(InterruptedException e)
    {
        System.out.println("InterruptedException");
    }
    }
}
public class threads {
    public static void main(String args[]) throws InterruptedException{ 
        A tr = new A();
        // tr.start();
        tr.fun();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Soni Pradhan");
            Thread.sleep(4000);
        }
        
        
    }
  }
