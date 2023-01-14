public class Student { 
  
    String name; 
    int roll_no; 
   
    public static void main(String args[]) 
    { 
         Student obj = new Student(); 
         obj.name = "John"; 
         obj.roll_no = 2; 
   
         System.out.println("Name = " + obj.name); 
         System.out.println("Roll No. = " + obj.roll_no); 
    } 
 }