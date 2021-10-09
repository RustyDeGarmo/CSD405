/*
Rusty DeGarmo
Professor Payne
Intermediate Java Programming
8 October 2021
*/

//Module 4 Redo

//The purpose of this program is to sort the largest value out of an 
//ArrayList that is populated by user input. The lowest possible
//largest value is zero.


import java.util.ArrayList;
import java.util.Scanner;

public class DeGarmoArrayListTest{
    public static void main(String[] args){
        int input;

        ArrayList<Integer> userList = new ArrayList<Integer>();
        Scanner myScan = new Scanner(System.in);

        System.out.println("\n\nEnter numbers to be sorted, enter zero (0) to end.");
        //obtain user input to populate the ArrayList
        do{
            input = myScan.nextInt();
            userList.add(input);
        }while(input != 0);

        System.out.println("\n\nYour list is: ");
        System.out.println(userList);
        System.out.print("The largest value is: ");
        System.out.println(max(userList));
        System.out.println("\n");
    }

        //sort out the biggest Integer
        public static Integer max(ArrayList list){
            int biggest = 0;
            if(list.size() == 0){
                return 0;
            }else{
                for(int i = 0; i < list.size(); i++){
                    if((int)list.get(i) > biggest){
                        biggest = (int)list.get(i);
                    }
                }
            }
            return biggest;
        }
}