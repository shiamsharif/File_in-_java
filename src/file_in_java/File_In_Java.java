package file_in_java;

import java.io.*;
import java.util.*;

public class File_In_Java {


    public static void main(String[] args) {
        // Create file is User input
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the file name: ");
            String filename = s.nextLine();

            File file = new File(filename+ ".txt");
            
            if(file.createNewFile()){
                System.out.println("Create file is :" + file.getName());
                
                // Write file
                try{
                    FileWriter filewriter = new FileWriter(file.getName());
                    filewriter.write("Bhai amar khub khuda lagche!!!!\n khyte dew please!!");
                    filewriter.close();
                    // System.out.println("Successfully wrote to the file.");
                    
                    // Read
                    try{
                        File fileread = new File(file.getName());
                        Scanner read = new Scanner(fileread);
                        while(read.hasNextLine()){
                            String data = read.nextLine();
                            System.out.println(data);
                        }
                        read.close();
                    }catch(FileNotFoundException e){
                        System.out.println("An Error occers!!!!!!!!!");
                    }
                } catch(IOException e){
                    System.out.println("Error is Write file!!!!!!!.");
                }
            }
            else{
                System.out.println("File already exist.");
            }
        } catch(IOException e){
            System.out.println("An Error Occer in CreateFile!!!!!!1!");
        }
        
        
        
       
    }
    
}
