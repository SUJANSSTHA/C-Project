package prvt;
class A{
    private void show()
    {
        System.out.println("Private mode try to accesss");
    }
}

public class privates {
    public static void main(String[] args) {
        A r = new A();
        r.show();
    }
}
