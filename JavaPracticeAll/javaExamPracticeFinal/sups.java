// super keyword
// super class refer to the object of super class it is used when we want to call the super clas variable, constructor, method through sub object.
class A{
    
        int a = 10;
        void sho(){
            System.out.println("Super/Parents method");
        }

    
}

class B extends A{
        int a=23;
        // super.a;
        // System.out.println(a);
        
       void sho()
       {
        System.out.println(a);
        System.out.println(super.a);
        
        System.out.println("Child method");
        super.sho();
       }
}
public class sups {
    public static void main(String[] args) {
        B er = new B();
        er.sho();
    }
}
