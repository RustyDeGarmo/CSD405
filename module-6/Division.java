/*
Rusty DeGarmo
Professor Payne
Intermediate Java Programming
9 September 2021
*/


abstract class Division {
    String divName;
    int accNumber;

    abstract void display();

    Division(String divName, int accNumber) {
        this.divName = divName;
        this.accNumber = accNumber;
    }
}
