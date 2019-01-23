package reader;

import java.util.*;
import java.io.*;

public class Reader{
    
    //create private scanner variable to read file path and filename
    /*comment this feature out for project
    private Scanner scan = new Scanner(System.in);
    */

    //method to read specified file into array of lines
    public ArrayList<String> readToArray(){
        //create ArrayList we will write to
        ArrayList<String> arr = new ArrayList<String>();
        try{
            /*this can be uncommented to allow for user input of filepath
            String path = scan.nextLine();
            File file = new File(path);
            */
            File file = new File("locations.txt");
            //create Buffered reader object
            BufferedReader br = new BufferedReader(new java.io.FileReader(file));
            //loop until file has no more lines to load into array
            String line;
            while ((line = br.readLine()) != null){
                arr.add(line);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
        return arr;
    }
}
