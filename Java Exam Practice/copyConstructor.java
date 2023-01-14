/*COPY CONSTURCTOR 
 * There is no copy consturctor in java but we can copy the value of one object to another like copy consturctor in C++
 * way of copy the value of one object into another in java
 * 1. by constructor 
 * 2. By assiging the value of one obejct into another
 * by clone () method of Object class
 */
 class Rectangle{
    int height;
    int width;
    Rectangle(int h, int w)
    {
        height = h;
        width = w;
    }
    Rectangle(Rectangle s)
    {
        height = s.height;
        width = s.width;
    }
    void display()
    {
        System.out.println(height+ " " + width);
    }
 }


public class copyConstructor{
    public static void main (String args[])
    {
        Rectangle s1 = new Rectangle(11,12);
        s1.display();
        System.out.println("copy Costructor");
        Rectangle s2 = new Rectangle(s1);
        s2.display();

    }
}