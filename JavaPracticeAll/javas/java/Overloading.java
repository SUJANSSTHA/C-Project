class Student{
    String name;
    int rollNo;
    int year;
    Student()
    {
        name = null;
        rollNo = 0;
        year = 0;

    }
    Student(String n, int r)
    {
        name = n;
        rollNo = r;

    }
    Student (String n , int r, int y)
    {
        name = n;
        rollNo = r;
        year = y;

    }
    void display()
    {
        System.out.println("RollNo:\t"+rollNo+ "\tName:\t"+name+ "\tYear:" +year);
    }
}


public class Overloading {
public static void main(String[] args) {
    Student s1 = new Student("sujan", 11);
    s1.display();
}

    
}
