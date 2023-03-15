class st{
    int a,b,c;
    void add()
    {
        a=10;b=20;
        c=a+b;
        System.out.println("Sum of two number"+c);
    }
    void sub()
    {
        a=10;b=20;
        c=a-b;
        System.out.println("Sum of sub number"+c);
    }

}
class B extends st{
    void multi()
    {
        a=10;b=20;
        c=a*b;
        System.out.println("Sum of * number"+c);
    }
    void div()
    {
        a=10;b=20;
        c=a/b;
        System.out.println("Sum of div number"+c);

    }

}
class C extends B{
    void rem()
    {
        a=10;b=3;
        c=a%c;
        System.out.println("Sum of % number"+c);
    }
}
public class hin {
    public static void main(String[] args) {
        C cc = new C();
        cc.add();
        cc.rem();

    }
}
