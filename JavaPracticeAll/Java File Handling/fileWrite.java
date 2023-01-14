import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args) {
      try{
        FileWriter f = new FileWriter("S:\\vs\\All-Practice\\JavaPracticeAll\\Java File Handling\\fileHandling.txt");
        try{
          // wrie() method to write
            f.write("Java Programming is the best Language... IF YOU want to learn java then plz subscribt my channel");
        }
        finally{
            f.close();
        }
        System.out.println("Scuuesfully Data wrote in File");
      }catch(IOException i)
      {
        System.out.println(i);
      }
    }
}
