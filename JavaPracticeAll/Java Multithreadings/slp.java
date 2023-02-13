class Aa extends Thread{
    public void run()
    {
        try{
        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);
            Thread.sleep(1000);
        }
    }catch(InterruptedException e)
    {
        
    }
}
}

public class slp {
   public static void main(String []args)
   {
    Aa t1 = new Aa();
    Aa t2 = new Aa();
    Aa t3 = new Aa();

    t1.start();
    t2.start();
    t3.start();

    t1.setName("Thread 1");
    t2.setName("thread 2");
    t3.setName("Thread 3");
   }
    
}
