public class Trangle {
    
public class Triangle { 
  
    // Declare the three sides of triangle 
    double side1, side2, side3; 
  
    // Constructor to initialize the sides 
    public Triangle(){ 
        side1 = 3; 
        side2 = 4; 
        side3 = 5; 
    } 
  
    // Function to calculate and return area 
    public double getArea(){ 
        double s = (side1 + side2 + side) / 2; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); 
    } 
  
    // Function to calculate and return perimeter 
    public double getPerimeter(){ 
        return side1 + side2 + side; 
    } 
  
    // Main Function 
    public static void main(String[] args) 
    { 
        Triangle obj = new Triangle(); 
        System.out.println("Area of the triangle = " + obj.getArea()); 
        System.out.println("Perimeter of the triangle = " + obj.getPerimeter()); 
    } 
}
}
