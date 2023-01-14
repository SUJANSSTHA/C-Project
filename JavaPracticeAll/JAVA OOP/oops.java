import javax.sound.sampled.SourceDataLine;

// note :- 
// 1. when new key use then it create the  space in memory and allocated all object 

class Pen{
    // properties 
    // we can use any way 
    // String color = "red";
    // String type = "gel";
    String color;
    String type;

    public void write(){
        System.out.println("\nwiting something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printPen(){
        System.out.println( "\n" +this.type);
    }
}
// now Student clas 
// note :- use always class Capital letter
// and function small letter  
// example of class 
// class Letter 

class Student{
    // inside class ma lakha ma lai PROPERTIES  bane xa 
    String name;
    int age;
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class oops {
    
    // now blueprint 
    public static void main(String args[])
    {
        // object 
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        // method call 
        // pen1.write();
        // pen1.printColor();
        // pen2.printColor();
        // pen1.printPen();
       
        // System.out.println(pen1.color + " "+ pen1.type);
        // System.out.println(pen2.color + " "+ pen2.type);
        
        // Student()  is a constructor
        Student s1 = new Student();
        // note :- new create new object 
        s1.age = 23;
        s1.name = "sujan";
        s1.printInfo();
    }
}
