package ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
     public static void main(String[] args) {
//         String text;
         try {
             File myFile = new File("last.json.txt");
             FileReader fileReader = new FileReader(myFile);
             BufferedReader reader = new BufferedReader(fileReader);

             String line;
             while ((line = reader.readLine()) != null){
                 System.out.println(line);
             }
             reader.close();
         } catch (FileNotFoundException fnf) {
             fnf.printStackTrace();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
 }