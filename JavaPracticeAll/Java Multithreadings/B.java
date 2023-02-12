class A extends Thread{
    public void run()
    {
        String n = Thread.currentThread().getName();
        try{
            
                    for(int i=1;i<=3;i++)
                    {
                        System.out.println(n);
                        sleep(1000);
                    }

        }catch(Exception i)
        {
            System.out.println("Wrong thread"); 
        }


    }
}
public class B {
    public static void main (String []args)
    {
        A t1= new A();
        A t2= new A();
        A t3= new A();

        t1.setName("Thread 1 Ram");
        t2.setName("Thread 2 Sita");
        t3.setName("Thread 3 Balram");
        
        t1.start();
        t2.start();
        t3.start();
    }
}