interface A{
    void show();
}
interface B{
    void show();
}
public class mul implements A,B{
    public void show()
    {
        System.out.println("interface A & B");
    }
    public static void main(String[] args) {
        mul a = new mul();
        a.show();
    }
    
}
