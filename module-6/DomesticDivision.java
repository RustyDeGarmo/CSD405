/*
Rusty DeGarmo
Professor Payne
Intermediate Java Programming
9 September 2021
*/


class DomesticDivision extends Division {
    String state;

    void display() {
        System.out.println("Division: " + divName);
        System.out.println("State: " + state);
        System.out.println("Account: " + accNumber);
    }

    DomesticDivision(String divName, int accNumber, String state) {
        super(divName, accNumber);
        this.state = state;
    }
}