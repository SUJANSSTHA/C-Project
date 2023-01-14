
/* This keyword refers to the current object or method in a consturctor.
this keyworrd refers to the current object or method in a constructor.
the most common use of this keyword is to eliminate the confusion between class attributes and parameters with the same name
 */
class ThisClass{
    void method1()
    {
        
        System.out.println("This is method 1");

    }
    void method2()
    {
        System.out.println("This is method 2");
        this.method1();
    }
}

public class This_keyword {
    public static void main (String args[])
    {
        ThisClass th = new ThisClass();
        th.method2();

    }
    
}
   