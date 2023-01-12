import java.io.*;
public class tryCF {
    public static void main(String[] args)throws IOException {
        File f = new File("S:\\vs\\All-Practice\\JavaPracticeAll\\Java File Handling\\tryCF.txt");
        if(f.createNewFile()){
            System.out.println("File successfully Created... in tryCF");
        }else{
            System.out.println("sorry try again");
        }
    }
}
