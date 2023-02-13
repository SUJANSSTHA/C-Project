class sl extends Thread{
    public void run()
    {
        String n = Thread.currentThread().getName();
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("\n"+n);
                sleep(5000);
            }
        }catch(InterruptedException i)
        {
            System.out.println("wrong thread");
        }

    }
}

public class sleep {
    public static void main(String args[])
    {
        sl t1 = new sl();
        sl t2 = new sl();
        sl t3 = new sl();
        t1.start();
        t2.start();
        t3.start();

        t1.setName("Thread 1 Ram");
        t2.setName("Thread 2 Sita");
        t3.setName("Thread 3 Rahul");
    }
}
