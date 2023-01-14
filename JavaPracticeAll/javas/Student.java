// package javas;

public class Student {
    String name;
    int roll_no;
    // public  should 
    //void mean it has no return type
    // main  is a method type

    public static void main(String[] a) {
        Student obj = new Student();
        obj.name= "John";
        obj.roll_no= 2;
        System.out.println("name="+obj.name);
        System.out.println("Roll No="+ obj.roll_no);
    }
}
