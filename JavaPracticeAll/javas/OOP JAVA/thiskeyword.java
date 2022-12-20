// class A{
//     // local variable
//     int a;
//     A(int a) // instant variable
//     {
//         this.a=a;
//     }

//     void show(){
//         System.out.println(a);
//     }
// }

// public class thiskeyword {
//     public static void main(String[] args) {
//         A r = new A(11);
//         r.show();
//     }
// }

// Parameter Constuctor this keyword 
// it  is also called parametrized constructor of its oun class.
class A{
    // local variable

    A() // instant variable
    {
        this(10);
    }
    A(int a)
    {
        System.out.println(a);
    }

}

public class thiskeyword {
    public static void main(String[] args) {
        A r = new A();
        
    }
}


