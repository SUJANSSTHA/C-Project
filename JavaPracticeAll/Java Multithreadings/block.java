class msg{
    public void show(String name)
    {
        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("How are You\t"+name);
            }
        }
    }
}
class ourThread extends Thread{
    msg m;
    String name;
    ourThread(msg m, String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}


public class block {
   public static void main(String args[])
   {
    msg m = new msg();
    ourThread t1 = new ourThread(m, "Anull");
    ourThread t2 = new ourThread(m, "ankush");
    
    t1.start(); t2.start();
   }

}
