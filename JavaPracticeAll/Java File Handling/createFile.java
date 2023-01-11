import java.io.*;
import java.io.File;

public class createFile {
    public static void main(String[] args) {
        File f = new File("S:\\vs\\All-Practice\\JavaPracticeAll\\fileHandlingtest\\test.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File success Created");
            }
            else{
                System.out.println("file allReady exit");
            }
        }catch(Exception e)
        {
            System.out.println("Exception handled!");
        }
        // }catch(IOException i){
        //     System.out.println("Exception Handled!");
        // }
     
    }
}
