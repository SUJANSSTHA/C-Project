import java.io.*;
import java.io.FileReader;
import java.io.IOException;

// Read Data from a File


public class fileReader {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("S:\\vs\\All-Practice\\JavaPracticeAll\\Java File Handling\\fileHandling.txt");
            try{
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.print((char)i);
                }

            }
            finally{
                r.close();
                System.out.println("file successfully close");

            }
        }catch(IOException i)
        {
            System.out.println("Exception Hanled...");
        }
    }
}
