/*
Rusty DeGarmo
Professor Payne
Intermediate Java Programming
26 September 2021
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// class to create objects to test with
class Item{
    int id;
    String itemName;
    double price;

    //constructor
    public Item(int id, String itemName, double price) {
        super();
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }
}

abstract class Mylambda {
    
    public static void main(String[] args) {
        
        //list to add items to
        List<Item> myList = new ArrayList<Item>();

        //create and add items to the list
        myList.add(new Item(1, "Teddy Bear", 5.95));
        myList.add(new Item(1, "Laptop", 495.95));
        myList.add(new Item(1, "Graphics Card", 9999.95));
        myList.add(new Item(1, "Phone", 495.95));
        myList.add(new Item(1, "Camera", 255.95));
        myList.add(new Item(1, "Coffee Maker", 25.95));

        //uses lambda to sort the list based on price and return items that meet
        //the search criteria
        Stream<Item> selection = myList.stream().filter(p -> p.price > 30);

        //uses lambda to print each item in the sorted list
        selection.forEach(item -> System.out.println(item.itemName + ": " + item.price));
    }
}
