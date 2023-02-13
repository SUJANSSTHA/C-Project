// example of synchronization 
// by implement runnable thread 
class Bus implements Runnable{
    int available = 2, passanger;
    Bus(int passanger)
    {
        this.passanger=passanger; // passanger=1;

    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(available>=passanger)
        {
            System.out.println(name+" Reversed Sead..");
            available=available-passanger;

        }else{
            System.out.println("Sorry seat not available");
        }
    }
}


public class met {
    public static void main(String[] args) {
        Bus r =new Bus(1);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Ram");
        t2.setName("Shyan");
        t3.setName("Raju");

        t1.start();
        t2.start();
        t3.start();

    }
    
}
