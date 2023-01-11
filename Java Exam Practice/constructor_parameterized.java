/* A constructor that has parameters is known as parameterized constructro */
class par{
    int width;
    int height;
    int depth;
    par(int w, int h, int d) // this is the constructro for parmeters
    {
        System.out.println("Parameterize Constructor");
        width = w;
        height = h;
        depth = d;
        int tot =  width * height * depth;
        System.out.println("parameterized constructor of total is "+tot);

    }
    // int vol(){
    //     return width * height * depth;
    // }
}

public class constructor_parameterized {
    public static void main (String []args)
    {
        par pr = new par(12,2,11);
        // int vl= pr.vol();
        // System.out.println("Volume in parameterie consturctor is "+vl);
    }
    
}
