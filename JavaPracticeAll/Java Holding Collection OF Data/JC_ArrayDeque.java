import java.util.*;

// FIFO
public class JC_ArrayDeque {
   public static void main(String[] args) {
    ArrayDeque<String> Name = new ArrayDeque<>();
    Name.add("sujan");
    Name.add("Pradhan");
    Name.add("Ram");
    Name.add("Sham");
    System.out.println(Name);
    Name.remove();
    System.out.println(Name);
   }
}
