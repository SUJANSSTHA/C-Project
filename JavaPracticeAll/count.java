public class count {
    int height;
    int width;
    count(int h,int w){
        height = h;
        width = w;
    }
    count(count s)
    {
        height=s.height;
        width=s.width;

    }
    void display()
    {
        System.out.println(height+" "+width);
    }
    public static void main(String[] args) {
         count s1= new count(11,12);
         count s2= new count(s1);
         s1.display();
         s2.display();
    }
}
