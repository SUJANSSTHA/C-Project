import javax.annotation.processing.SupportedSourceVersion;

public class Trangles {
    // Declare the three sides of triangle 
    double side1, side2, side3;
    // const:ructor to initialize the sides
    public Trangles(){
        side1 = 3;
        side2 = 4;
        side3= 5;
    }
    // function to calculate and return area 
    public double getArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
    }
    // function to calculate and return perimeter
    public double getPerimeter(){
        return side1+side2+side3;

    }
    //Main Function 
    public static void main(String[]args)
    {
        Triangle obj = new Triangle();
        System.out.println("Area of the tringle = "+ obj.getArea());
        System.out.println("Perimeter of the tringle = "+ obj.getPerimeter());

    }
}
