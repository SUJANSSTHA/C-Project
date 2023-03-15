// class Person{
//     int age=21;
//     int weight = 44;
//     String color = "Light";
//     void eat()
//     {
//         System.out.println("I'm eating");
//     }
//     void sleep()
//     {
//         System.out.println("I'm sleeping");
//     }
// }
// public class cls {
//     public static void main(String[] args) {
//         Person pp = new Person();
//         pp.eat();
//         pp.sleep();
//         System.out.println("\n"+pp.age +" "+ pp.weight);
//     }
// }



// Parametrized constructor 

// class A{
//     int x, y;
//     A(int a,int b)
//     {
//         x=a;y=b;
//     }
//     A(int a,String b){
//         System.out.println(a+" "+b);

//     }

//     void show()
//     {
//         System.out.println(x+"\t"+y);
//     }
// }
// public class cls {
//     public static void main(String[] args) {
//         A r = new A(100,200);
//         A re = new A(10,"sujan");
//         r.show();
//     }
// }


// class bx{
// double wed;
// double heg;
// bx(double w,double h)
// {
// wed=w;
// heg= h;
// }
// double display()
// {
//     return wed+heg;

// }
// }
// public class cls {
//     public static void main(String[] args) {
//         bx a=new bx(10.0,20.2);
//         // a.display();
//         System.out.println(a.display());
        
//     }
// }



// copy constructor 
// when ever we pass object reference to the constructor is called copy constructor

// class A{
//     int a; String b;
//     A()
//     {
//         a=10;b="Java";
//         System.out.println(a+" "+b);

//     }
//     A(A ref)
//     {
//         a=ref.a;
//         b=ref.b;
//         System.out.println(a+" "+b);
//     }
// }

// public class cls{
//     public static void main(String[] args) {
//         A r = new A();
//         A r1 = new A(r);
        
//     }
// }

// Private constructor 

// A{
//     int a; double b; String c;
//     private A()
//     {
//         a=10;b=30.3;c="Ran";
        

//     }
// }
public class cls{
         int a; double b; String c;
    private cls()
    {
        a=10;b=30.3;c="Ran";
        System.out.println(a+" "+b+" "+" "+c);
        

    } 
    static void Show()
    {
        
    }
    public static void main(String[] args) {
        cls prv = new cls();
    
        
  
    }
}