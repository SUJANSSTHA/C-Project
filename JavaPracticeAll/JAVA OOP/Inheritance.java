// Inheritance can be defiened as the procedure or mechanism of acuiring all the properites and behavior of one class to another.

// Types  of Inheritance 
// - 1) Single Level Inheritance 
//  
// Base class or Parents class 
class Shape{
    String color;

}
// child class or sub class 
class Triangle extends Shape{

}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";

       System.out.println("\nsujan = "+t1.color); 
    }
}
