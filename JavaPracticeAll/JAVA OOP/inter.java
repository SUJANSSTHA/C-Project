class Student{
    String name;
   static String school;
   public static void changeSchool()
   {
    school = "newSchool";
   }
}


public class inter {
    public static void main(String[] args) {
        Student.school = "Itahari Nanuma College";
        Student st = new Student();
        st.name = "Sujan";
        System.out.println(st.school);
    }
}

// static keyword 
// static means everyone should access it 