import java.util.*;
public class JC_Stack {
    public static void main(String[] args) {
        Stack<String> Name = new Stack<>(); // LIFO
        Name.push("sujan");
        Name.push("Pradhan");
        Name.push("Ram");
        Name.push("Sham");
        System.out.println(Name);
        Name.pop();
        System.out.println(Name);
    }
}
