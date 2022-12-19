import javax.sound.sampled.SourceDataLine;

class A{
    int a=10; String name= "sujan";
    // A(){
    //     a=10; name=null;
    // }
    void show()
    {
        System.out.println(a+" "+name);
    }


}


public class Constuctor {
    public static void main(String[] args) {
        A su = new A();
        su.show();
    }
}
