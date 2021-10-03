/*
Rusty DeGarmo
Professor Payne
Intermediate Java Programming
9 September 2021
*/


class InternationalDivision extends Division {
    String country;
    String language;

    void display() {
        System.out.println("Division: " + divName);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println("Account: " + accNumber);
    }


    InternationalDivision(String divName, String country, String language, int accNumber) {
        super(divName, accNumber);
        this.country = country;
        this.language = language;
    }
}
