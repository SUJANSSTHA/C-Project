import java.io.File;
import java.io.*;

public class createFile {
    public static void main(String[] args) {
        
        try{
           FileWriter f = new FileWriter("S:\\vs\\All-Practice\\JavaPracticeAll\\javaExamPracticeFinal\\fileCreated.txt");
           try{
            f.write("java program is the ..");
             
            }
            finally{
                f.close();
            }

        }catch(IOException i)
        {
            System.out.println("Excetion handled");
        }
     
    }
}
