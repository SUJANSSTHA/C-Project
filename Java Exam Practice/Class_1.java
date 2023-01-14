public class Class_1 {
    // common properties 
    int age = 12;
    int weight = 34;
    String color = "red";

    // behaviour 
    void eat()
    {
        System.out.println(" I am Eating");
        
    }
    void sleep ()
    {
        System.out.println("I am sleeping");
    }
    void study()
    {
        System.out.println("I am Studying");
    }

    public static void main(String[] args){

        // creating a object  with new keyword
        Class_1 Op = new Class_1();

        // access properties 
        System.out.println(Op.age);

        // access behaviour 
        Op.eat();
        Op.sleep();
    }
}
