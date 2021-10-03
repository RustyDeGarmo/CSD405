/*
Rusty Degarmo
Professor Payne
Intermediate Java Programming
5 September 2021
*/

//import Scanner, Math.Random, and File things
import java.util.Scanner;
import java.lang.Math;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewFile{
    public static void main(String [] args){
        File newFile = new File("data.txt"); //create file object

        try{
            if(newFile.createNewFile()) {
                FileWriter myWriter = new FileWriter("data.txt");
                for(int i = 0; i < 10; i++) {
                    int ran = (int)(Math.random()* 100 + 1);
                    myWriter.write(ran + " ");     
                }
            }else {
                FileWriter myWriter = new FileWriter("data.txt", true);
                myWriter.write("\n");
                for(int i = 0; i < 10; i++) {
                    int randInt = (int)(Math.random()* 100 + 1);
                    myWriter.write(randInt + " ");    
                }
                myWriter.close();  
            }
        }catch(Exception e){
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
        try{
            Scanner myReader = new Scanner(newFile); //create scanner to read file
            System.out.println("\n\n");
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                System.out.println(line);
            }
            myReader.close();
        }catch(Exception e) {
            System.out.println("Something went wrong. The file might not exist.");
        }

        System.out.println("\n\n");
    }
}