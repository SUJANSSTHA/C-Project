// function overloading 

class Students{
    String name;
    int age;

    // method 1
public void printInfo(String name)
{
    System.out.println(name);
}
// method 2
public void printInfo(int age) {
    System.out.println(age);
    
}
// method 3
public void printInfo(String name, int age) {
    System.out.println(name+" "+age);
    
}
}



public class Poly {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Sujan";
        s1.age = 22;
        s1.printInfo(s1.name);
    }

}
