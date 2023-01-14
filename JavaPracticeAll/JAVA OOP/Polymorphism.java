import java.rmi.server.RemoteRef;

// Polymorphism 
// Poly mean many and many  and morphish means form 
// single work done by many other way is called Polymorphism

// Method overloading 
// Method overraiding

// type of Polymorphism
// compile type Polymorphism
// run type Polymorphism


// type of Polymorphism
// Method overloading
// if we define many methods with same name but with difference in parameters then this process is called method overloading 
// ex. use of method overloading to find sum of various data items



public class Polymorphism {
    public int sum(int x, int y)
    {
        return (x + y);
    }
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
    // public double sum(double x, double y)
    // {
    //     return(x+y);
    // }
    public static void main(String[] args) {
        Polymorphism ss = new Polymorphism();
      System.out.println(ss.sum(11,11));
    }
}
