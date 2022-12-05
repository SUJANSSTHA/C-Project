
 import java.util.Scanner;
public class Area {
   
        int length;
        int breadth;
    
        Area(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
    
        public int returnArea() {
            return length * breadth; 
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle: ");
            int length = sc.nextInt();
            System.out.println("Enter the breadth of the rectangle: ");
            int breadth = sc.nextInt();
            
            Area a = new Area(length, breadth);
            System.out.println("Area of the rectangle is: " + a.returnArea());
            sc.close();
        }
    }
