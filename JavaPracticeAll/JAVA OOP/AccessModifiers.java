// AccessModifiers 3 type in Java
// 1)Public 
// public can access  everyone

// 2)private 
// 3) protative
// 4) default
class Account{
    public String name;
    protected String email;
    private String password;

    // getters and setters 
    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String pass)
    {
        this.password = pass;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Sujan";
        a1.email = "Sujan@gmail.com";
        a1.setPassword("pasdsfjsl;ajs");
        System.out.println(a1.name);
        System.out.println(a1.email);
        System.out.println(a1.getPassword());

    }
}
