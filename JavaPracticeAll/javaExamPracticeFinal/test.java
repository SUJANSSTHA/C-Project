import java.util.HashMap;

/*
public class test{
    public static void main(String args[])
    {
     int y;
     String str = "10";
    //  can not convert string to int 
     y=Integer.parseInt(str);
     System.out.println(y);
    }
}
 */


 /*

    import java.util.HashMap;
import java.util.Map;

public class test{
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    // Adding key-value pairs to the map
    map.put("John", 25);
    map.put("Jane", 30);
    map.put("Jim", 35);

    // Retrieving values by their keys
    System.out.println("John's age: " + map.get("John"));
    System.out.println("Jane's age: " + map.get("Jane"));

    // Checking if a key is present in the map
    System.out.println("Is 'Jim' in the map? " + map.containsKey("Jim"));

    // Getting the size of the map
    System.out.println("Number of key-value pairs in the map: " + map.size());

    // Removing a key-value pair from the map
    map.remove("Jim");
    System.out.println("Number of key-value pairs in the map after removing 'Jim': " + map.size());

    // Iterating over the keys and values in the map
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
 */

//  Map and HashMap store the value in the form of key value pari
import java.util.*;
public class test{
    public static void main(String[] args) {
        Map<String, String>fruits = new HashMap<>();
        fruits.put("red","apple");
        fruits.put("yellow", "banana");
        fruits.put("white", "radish");
        fruits.put("green", "apple");
        System.out.println(fruits.get("red"));


        
        for(Map.Entry pairEntry:fruits.entrySet()){
            System.out.println(pairEntry.getKey()+":"+pairEntry.getValue());
        }
    }

}
