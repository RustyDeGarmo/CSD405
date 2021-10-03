/*
Rusty Degarmo
Professor Payne
Intermediate Java Programming
5 September 2021
*/

//import ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class UserArray{
    
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in); //create my scanner
        ArrayList<String> userStrings = new ArrayList<String>(); //create ArrayList to hold user strings
        int index = 0; //integer to display the element index

        
        userStrings.add("String 1");
        userStrings.add("String 2");
        userStrings.add("String 3");
        userStrings.add("String 4");
        userStrings.add("String 5");
        userStrings.add("String 6");
        userStrings.add("String 7");
        userStrings.add("String 8");
        userStrings.add("String 9");
        userStrings.add("String 10");

        System.out.println("\n\nThe strings are: ");

        for(String x : userStrings) {
            System.out.println(index + ": " + x);
            index++;
        }


        try {
            System.out.println("\n\nChoose an element index number to view again.");
            Integer userIndex = myScanner.nextInt();
            System.out.println("\n\nYou chose the string at index: " + userIndex);
            System.out.println("The string is: " + userStrings.get(userIndex));
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }        

        System.out.println("\n\n"); //Just creating space

    }
}

    

