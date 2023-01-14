//  note :- 1. new :- new allocate the space in memory and store all object in there memeory
// Consturctor means that to create object in java
// type of Consturctor are 
// 1. non parameterized Consturctor

// properties of Consturctor 
// 1. class or object Consturctor have same name as have class 
// Consturctor name and class name is same
// example 
// class Student{

// }
// public class sujan{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//     }
// }

// 2. Consturctor does not return any value 
//  3. constructor can only one time

class Student{
    // inside class ma lakha ma lai PROPERTIES  bane xa 
    String name;
    int age;
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // normal constructor or non parameterized constructor 
    // Student(){
    //     System.out.println("constuctor called");
    // }

    // Parameterized constructor 
    //  defination A consturctor that has parameters is known as parameterized constructor
    // Student(String name, int age){
    //     // System.out.println("constuctor called");
    //     this.name = name;
    //     // note  this.name is object name and name is parameter
    //     this.age = age;

    // }
    

    // copy constructor 
    // There  is no copy constructor in ajava But we can copy the values of one object to another like copy constructor in C++.

    // There are many ways to copy the values of one object into another in java

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;

    }
    Student()
    {
        
    }

}



public class Consturctor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sujan";
        s1.age = 11;
        
        Student s2 = new Student(s1);
        s2.printInfo();
    }
    
}
