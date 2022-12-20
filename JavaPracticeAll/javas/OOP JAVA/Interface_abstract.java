import java.util.jar.Attributes.Name;

interface vehical{
   String Name = "TVS"; // public + static + final
   int Speed = 100; // public + static + final
   
   void start(); // public + abstract
   void stop(); // by default public + abstract

}
class Customer implements vehical{
    @Override
    public void start()
    {
        System.out.println("\n\n\nstart(): insert key & pres start button");
    }
    @Override
    public void stop()
    {
        System.out.println("\n\nstop(): exit key");
    }
}

public class Interface_abstract {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.start();
        c.stop();
    }
}
