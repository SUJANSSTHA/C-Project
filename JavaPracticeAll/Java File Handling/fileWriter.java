import java.io.*;
// import java.fileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        try{
            fileWriter f = new fileWriter("S:\\vs\\All-Practice\\JavaPracticeAll\\fileHandlingtest\\fileWriter.txt");
            try{
                f.write("Java programming is the best Language..");
            }
            finally{
                f.close();
            }
            System.out.println("Succesfully worte in the file");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
    
}
