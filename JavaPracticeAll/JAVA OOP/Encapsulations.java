// Encapsulation means that data and method combine together in single entity  and make single unit
// with the help of Encapsulation data Hiding can be done 


// Data hiding
// Data hiding is the process of protecting members of class from unintended changes whereas, 

// abstract 
// abstraction is hiding the implementation details and showing only important/ usefull pairts to the user.

// Abstract class Properties 
// An abostract class must be declared with an abstract keyword.
// it can have abstract and non abstract methods
// it cannot be instantiated.
// it can have constructors and static method also.
// can have final methods which will force the subclass not to change the body of the method.

abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk()
    {
        System.out.println("waks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk()
    {
        System.out.println("waks on 2 legs");
    }
}




public class Encapsulations {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chicken ch = new Chicken();
        ch.walk();
        // System.out.println();
    }
}
