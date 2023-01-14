

class A implements Runnable{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("My child Thread");
        }
    }
}


public class impl {
    public static void main(String[] args) {
        
    
    A r = new A();
    Thread t = new Thread(r);
    
    t.start();
    for(int i=1;i<=5;i++)
    {
        System.out.println("My main Thread");
    }
}
}
 
// class A implements Runnable{
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println("My child Thread");
//         }
//     }
// }


// public class impl {
//     A r = new A();
//     Thread t = new Thread(r);
    
//     t.start();
//     t.join(); //pausing the main thread
//     for(int i=1;i<=5;i++)
//     {
//         System.out.println("My main Thread");
//     }
// }
