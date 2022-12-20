// class A{
//     int a=10;
// }
// class B extends A{
//     int a=20;
//     void show()
//     {
//         System.out.println(a);
//         System.out.println(super.a);
//     }
// }
// public class Super {
//     public static void main(String[] args) {
//         B sh = new B();
//         sh.show();
//     }

// }


//  using Method in super 

// class A{
//    void show(){
//     System.out.println("hello world");
//    }
// }
// class B extends A{

//     void show()
//     {
//         super.show();
//         System.out.println("Hello World Second");
//     }
// }
// public class Super {
//     public static void main(String[] args) {
//         B sh = new B();
//         sh.show();
//     }

// }

// Constructior

class A{
    A(){
    System.out.println("hello world");
   }
}
class B extends A{

    B()
    {
    
        System.out.println("Hello World Second");
    }
}
public class Super {
    public static void main(String[] args) {
        B sh = new B();
        // sh.show();
    }
 
}


