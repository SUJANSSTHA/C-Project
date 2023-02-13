// by creating thread by implementing methods 
class A implements Runnable{
public void run(){
for(int i=0;i<5;i++)
{
    System.out.println("\nImplementing Thread by runnable");
}
}
}

public class runThread {
    public static void main(String args[])
    {
        A ru = new A();
        Thread t = new Thread(ru);
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Main Thread");
        }

    }
}
