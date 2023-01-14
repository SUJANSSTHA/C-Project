// ArrayList 
import java.util.*;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class JC_ArrayList {
public static void main(String[] args) {
    ArrayList<String> Name = new ArrayList<String>();
    // we are creating direct Object bez it is predefine implementation class 
    Name.add("sujan");
    Name.add("Pradhan");
    Name.add("Ram");
    Name.add("Sham");
    System.out.println(Name);
    Name.add("Ganesh");
    System.out.println(Name);

    
    Name.add(2,"Rohit");    //middle ma add garnu ko lage 
    System.out.println(Name);

    Name.add(0,"Ankush"); // beging ma add gara ko
    System.out.println(Name);

    Name.add(7,"Altaf");
    System.out.println(Name);


    Name.remove(0); // for remove index
    System.out.println("\n"+ Name);

    Name.set(2,"GANESH"); // for rename any index 
    System.out.println(Name);

    System.out.println("\n"+Name.get(0)); // matra auta index print garnu xa baxa
    Name.clear(); // sabai index ma bako hata nu xa bana
    System.out.println(Name);
}    
}
