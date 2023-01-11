class Facts{
    int fat(int n)
    {
        int result;
        if(n==1)
        {
            return 1;
        }
        result = fat(n-1)*n;
        return result;

    }
}

public class Recursion_2 {
    public static void main(String args [])
    {
        Facts rec = new Facts();
        System.out.println("Factroial of 3 is "+rec.fat(3));
    }
    
}
