// this keyword 
// it referes to the curerent object inside the method or constructor.
/*
public class Tkeys {
    int a;
    Tkeys()
    
    {
        a=20;
        System.out.println("hello");
    }
    Tkeys(int a)
    {
        this();
        System.out.println(a);
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Tkeys r = new Tkeys(100);
        // System.out.println(r);
        // r.show();

    }
}
 */
// Encaplution 
import java.util.*;
import java.util.Scanner;;
class Bank{
    private double bal =5000;
    private int  pwd;

    public void Deposite(double money)
    {
        System.out.println("Enter password");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd==123)
        {
            bal=bal+money;
            System.out.println("Deposti money"+money);
            System.out.println("TB"+bal);
            
        }else{
            System.out.println("Incorrect password");
        }

    }
    public void withdraw(double money)
    {
        System.out.println("Enter password");
        Scanner s = new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==123)
        {
            bal=bal-money;
            System.out.println("withdraw moeny "+money);
            System.out.println(bal);
        }else{
            System.out.println("Incorrect password");
        }

    }
    public void cbal()
    {
        System.out.println("Enter password");
        Scanner s = new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==123){
            System.out.println("total bal"+bal);
        }

    }


}

public class Tkeys{
   
   public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);
    int ch;
    Bank bank=new Bank();
    System.out.println("1 dep");
    System.out.println("2. WD");
    System.out.println("CB");
    System.out.println("\n Enter your choice");

     Scanner s = new Scanner(System.in);
     ch=s.nextInt();

     switch(ch)
     {
        case 1 : bank.Deposite(1000); break;
        case 2 : bank.withdraw(2000); break;
        case 3 : bank.cbal(); break;
        default: System.out.println("invalid choice"); break;

     }
   }
}
 