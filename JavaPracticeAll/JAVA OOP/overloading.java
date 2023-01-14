public class overloading {
    public int sum(int x, int y)
    {
        return (x+y);
    }
    public int sum(int x, int y, int z)
    {
        return (x+y+z);
    }
    public double sum(double x, double y)
    {
        return(x+y);
    }
    public static void main(String[] args) {
        overloading a = new overloading();
        System.out.println(a.sum(10,11));
    }
}


// public class overloading{
  
//     // Overloaded sum(). This sum takes two int parameters
//     public int sum(int x, int y) { 
//         return (x + y);
//      }
  
//     // Overloaded sum(). This sum takes three int parameters
//     public int sum(int x, int y, int z)
//     {
//         return (x + y + z);
//     }
  
//     // Overloaded sum(). This sum takes two double
//     // parameters
//     public double sum(double x, double y)
//     {
//         return (x + y);
//     }
  
//     // Driver code
//     public static void main(String args[])
//     {
//         overloading s = new overloading();
//         System.out.println(s.sum(10, 20));
//         System.out.println(s.sum(10, 20, 30));
//         System.out.println(s.sum(10.5, 20.5));
//     }
// }