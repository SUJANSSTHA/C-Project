class Employee{
    private int id;
    long salary;
    String name;
}

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
    id = i;
    }


public class Encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();
        // employee.getId=10;
        employee.setId(1);
        System.out.println(employee.getId());
    }
}

