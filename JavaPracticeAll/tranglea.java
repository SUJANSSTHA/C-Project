
public class tranglea{
    double side1, side2, side3;
    public tranglea(double side1, double side2, double side3)
    {
        this.side1= side1;
        this.side2= side2;
        this.side3= side3;

    }
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    public static void main(String[] args) {
        tranglea t1 = new tranglea(3, 4, 5);
        System.out.println("Area of Triangle is : " + t1.getArea());
        System.out.println("Perimeter of Triangle is : " + t1.getPerimeter());
}
}