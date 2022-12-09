class A{
    public int a;
    public int sujan()
    {
        return 4;
    }
    public void met()
    {
        System.out.println("\nI am method 2 of class A");
    }
}
class B extends A{
    public void met3()
    {
        System.out.println("\nI am method 3 of class B");
    }
}





public class methodOverloading {
    public static void main(String[] args) {
        // object 
        A a= new A();
        a.met();

        B b= new B();
        b.met();
    }
    
}
//connect to mongodb in nodejs? 








