/*
 * default Constructor
 * A constructor that has no parameter is called deault consturctor
 * syntex 
 * class Simple {
 * Simple(){
 * System.out.println(This is inside constructor)
 * }
 * public static void main (String []args)
 * {
 * Simple b = new Simple();
 * }
 * }
 * 
 */

// public class constructor_default {
//     String name;
//     int roll;
//     void display()
//     {
//         System.out.println(roll+" "+name);
//     }
//     public static void main(String args[])
//     {
//         constructor_default def = new constructor_default();
//         def.display();
//     }
// }

class box{
    double width;
    double height;
    double depth;
    // box is the default consturctor for the box
    box(){
        System.out.println("Constructing Box");
        width = 20;
        height= 10;
        depth = 60;
        double a =  width*height*depth;
        System.out.println("volume is "+a);

    }
    // double volume()
    // {
    //     return width*height*depth;
    // }
}

public class constructor_default{
    public static void main (String[]args)
    {
        box b = new box();
        // double vol = b.volume();
        // System.out.println("volume is "+vol);


    }

}
