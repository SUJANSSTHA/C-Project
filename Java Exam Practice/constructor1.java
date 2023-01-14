//  constuctor is a spicial type of method whose name is same as class

// note : main purpose of constructor is to initialize the object
// constructor has no return value even void 
// every java has a constructor
// A  constuctor is automatically call at the time of object creationl
// example of defalut consturctor 

/* Default constructor 
 * A consturctor that has no parameter is called default constructor.
 * syntex
 * class Class_name{
 * Class_name(){
 *          }
 * }
 */

 class A{
    int a; 
    String name;
    A(){
        a=0;
        name= null;

    }
    void show()
    {
        System.out.println(a+" "+ name);
        System.out.println("Hello world");

    }
 }

public class constructor1 {
     public static void main(String[]args)
    {
        A cons = new A();
        cons.show();
    }
}
