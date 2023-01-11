// constructor_overloading
class Student{
    String name;
    int rollNo;
    int year;
    // Student(){
    //     name = null;
        
    //     rollNo = 0;
    //     year = 0;
    // }
    Student(String n, int r)
    {
        name = n;
        rollNo = r;
    }
    Student(String n, int r, int y)
    {
        name = n;
        rollNo = r;
        year = y;
    }

    void display()
    {
        System.out.println("\nconsturctor overloading");
        System.out.println("Roll No "+rollNo+" Name "+name+"Year is "+year);
    }
}


public class constructor_overloading {
public static void main( String args []){
    
Student st = new Student("sujan", 10, 2);
Student st2 = new Student("ram", 10);
st2.display();
st.display();
}
    
}
