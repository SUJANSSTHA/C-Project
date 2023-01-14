// thread
// 1). By extending Thread class 

class A extends Thread{
    // @Override
    public void fun()
    {
      try{
        for(int i=1;i<=5;i++)
        {
            System.out.println("SUJAN");
            Thread.sleep(2000);
        }
      }catch(InterruptedException i)
      {

      }
      
    }
}

public class thre {
    public static void main(String[] args) throws InterruptedException{
        A t=new A();
        t.fun();

        for(int i=1;i<=5;i++)
        {
            System.out.println("PRADHAN");
            Thread.sleep(2000);
        }
    }
}
