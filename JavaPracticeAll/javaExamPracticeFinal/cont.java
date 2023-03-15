/*
class A{
    int a; String name;
    A()
    {
        a=10;name="Ram";
        // System.out.println(a+ " "+ name);
    }
    void show()
    {
        System.out.println(a+ " "+ name);

    }
}
 */
// class A{
//     String name;
//     int roll;
//     // void display 
// }

// public class cont {
//     public static void main(String[] args) {
//        A aa = new A();
//         // aa.show();
//     }
// }

// defalut constructor 
class A{
    int a=2;
    String name = "Ram";
    A()
    {
        System.out.println(a+"\n"+name);

    }
}
public class cont{
public static void main(String[] args) {
    A aa=new A();
}
}