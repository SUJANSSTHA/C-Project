public class Rectangle {

 
        int length; 
        int breadth; 
         
        //Constructor 
        public Rectangle(int length, int breadth) { 
         
         this.length = length; 
         this.breadth = breadth; 
        } 
         
        //Area Method 
        public int Area() { 
         return this.length * this.breadth; 
        } 
         
        public static void main(String[] args) { 
         //creating two objects 
         Rectangle rec1 = new Rectangle(4, 5); 
         Rectangle rec2 = new Rectangle(5, 8); 
         
         //Area of first rectangle 
         int area1 = rec1.Area(); 
         System.out.println("Area of first rectangle = " + area1); 
         
         //Area of second rectangle 
         int area2 = rec2.Area(); 
         System.out.println("Area of second rectangle = " + area2); 
        } 
       }
