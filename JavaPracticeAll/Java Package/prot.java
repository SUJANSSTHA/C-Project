package protacteds;
 
class d{
    // protected access modified in package
   protected void show()
    {
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        int a=10,b=20;
        if(a<b)
        {
            System.out.println("a is grater");
        }
        else{
            System.out.println("b is greater;");
        }
    }
}


public class prot extends d{

    public static void main(String[] args) {
        prot r = new prot();
        r.show();
    }
}






























/* 
package protacteds;

class d{
    // protected access modified in package
   protected void show()
    {
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        int a=10,b=20;
        if(a<b)
        {
            System.out.println("a is grater");
        }
        else{
            System.out.println("b is greater;");
        }
    }
}


public class prot {
    protected void show()
    {
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        System.out.println("\n\n\nPackage protected access modified in package");
        int a=10,b=20;
        if(a<b)
        {
            System.out.println("a is grater");
        }
        else{
            System.out.println("b is greater;");
        }
    }
    public static void main(String[] args) {
        prot r = new prot();
        r.show();
    }
}



*/