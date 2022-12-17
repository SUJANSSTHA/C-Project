
// Types  of Inheritance 
// - 1) Single Level Inheritance 

// Base class 
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
// Single Inheritance
class Triangle extends Shape{
     public void area(int l, int h)
     {
        System.out.println(1/2*l*h);
     }
}
// Multi-level Inheritance
// In this  thpe of Inheritance a derved class gets created from another derived class and can have any number of levels 

// class EquilateralTriangle extends Triangle{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h); 
//     }
// }

// Hierarichical Inheritance 
// In this type, two or more classes inheit the properites of one existing class. When more then one clases are derived from a single base class, such inheitance is known as Hierarchical Inheritance, where features that are common in loerr level are included in parent class.

class Circle extends Shape{
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }
}

// 4 Hybrid Inheritance 
// in this Inheritance different different type of heritance are shown in here

// 5 Multi level Inheritance 

public class SingleLevInheritance {
    
}
