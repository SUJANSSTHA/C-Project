import java.io.*;
public class createFile {
    public static void main(String[] args)throws IOException {
        // File f = new File("S:\\vs\\All-Practice\\JavaPracticeAll\\fileHandlingtest\\createdfile.txt");
        File f = new File("S:\\vs\\All-Practice\\JavaPracticeAll\\Java File Handling\\fileHandling.txt");
     
        if(f.createNewFile()){
            System.out.println("File successFully Created");
        }
        else{
            System.out.println("File Already Exist...!");
           }
       
      
     
    }
}
