
import java.util.Scanner;

abstract class Bank{
    public String Name = "Nepal Rastra Bank";
    // public String IFSC = "myBank123";
     Scanner sn = new Scanner(System.in);

    public void bankDetail()
    {
      
        System.out.println("Bank Name: "+Name);
        
    }
    // Password : 123;
        abstract void Deposite();
        abstract void  Withdraw();
        abstract void CheckBal();
        

}
// class bankService extends Bank{
class bankService extends Bank{
    private double bal = 5000;
    private int pwd;
    private double money;

    // double
    public void Deposite(){
        System.out.println("Enter Password:");
        // Scanner sn = new Scanner(System.in);
        pwd =sn.nextInt();
        if(pwd==123)
        {
            System.out.println("Enter Deposit Amount");
            money=sn.nextDouble();
            bal = bal+money;
            System.out.println("Deposited Money:"+money);
            System.out.println("Total Balance:\t"+bal);
        }
        else
        {
            System.out.println("You have enter wrong Password");
        }
    }

    // withdraw
    public void Withdraw(){
        System.out.println("Enter Pasword");
        // Scanner sn = new Scanner(System.in);
        pwd = sn.nextInt();
        if(pwd==123)
        {
            System.out.println("Enter widthdraw Amount:\t");

            money = sn.nextDouble();
            bal = bal - money;
            System.out.println("Withdrawn Money :\t"+money);
            System.out.println("Total Balance:"+bal);
        }
        else{
            System.out.println("You have enter wrong Password");
        }
    
    }

    // for bals check
    public void CheckBal(){
        System.out.println("Enter Password");
        pwd = sn.nextInt();
        if(pwd==123)
        {
            System.out.println("Total Balance:\t"+bal);

        }
        else
        {
            System.out.println("You have enter wrong password");
        }
    }    
}

// withdraw


public class Aigenerated {
    public static void main(String[] args) {
        // bankService object 
        bankService b = new bankService();
        b.bankDetail();

        int ch;
        System.out.println("1. Deposite: \n 2. Withdraw \n 3. CheckBalance:");
        System.out.println("Enter Your Choice");
        Scanner s2 = new Scanner(System.in);
        ch = s2.nextInt();
        switch(ch)
        {
            case 1:
            b.Deposite();break;
            case 2:
            b.Withdraw();break;
            case 3:
            b.CheckBal();break;
          default: 
          System.out.println("Invalid Choice:");
        }

    }
}