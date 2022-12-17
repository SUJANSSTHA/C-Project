// defining A package 
// Java  package is a group of similar types of classes, interfaces and sub-packages or we can say Packages in Java is a machanism to eccapsulate a group of classes, interfaces and sub packages which is used to porviding access protection and namespace management and to make searching/ locating and usage of classes, interfaces, enumeratins and annotations easier.



// Base class 
import java.util.*;

class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
     public void area(int l, int h)
     {
        System.out.println(1/2*l*h);
     }
}



class Circle extends Shape{
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }
}

public class Encapsulation {

  public static void main(String[] args) {
    
  }  
}
