abstract class animal{
    void legs()
    {
        System.out.println("all amimals have 4 legs");
    }
  abstract  void sound();
    abstract void eat();
}
class Dog extends animal{
    @Override
    void sound()
    {
        System.out.println("Bow bow..");
    }
    void eat()
    {
        System.out.println("Meat Eating.");
    }
}
class Cow extends animal{
    @Override
    void sound()
    {
        System.out.println("000 oooo..");
    }
    void eat()
    {
        System.out.println("Grass Eating.");
    }
}


public class Abstract_ex {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cow c = new Cow();
        d.eat();
        d.sound();
        c.eat();
        c.sound();
        d.legs();
        c.legs();
        
    }
}
