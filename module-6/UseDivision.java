/*
Rusty DeGarmo
Professor Payne
Intermediate Java Programming
9 September 2021
*/


class UseDivision {
    public static void main(String[] args) {
        DomesticDivision dom1 = new DomesticDivision("Division One", 1234, "New Jersey");
        DomesticDivision dom2 = new DomesticDivision("Division Two", 2345, "Nebraska");

        InternationalDivision inter1 = new InternationalDivision("Division Three", "Japan", "Japanese", 3456);
        InternationalDivision inter2 = new InternationalDivision("Division Four", "Canada", "English/French", 4567);

        System.out.println("\n\n");
        dom1.display();

        System.out.println("\n\n");
        dom2.display();

        System.out.println("\n\n");
        inter1.display();

        System.out.println("\n\n");
        inter2.display();

    }
}
