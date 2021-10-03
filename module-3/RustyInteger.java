/*
Rusty Degarmo
Professor Payne
Intermediate Java Programming
29 August 2021
*/

//import ArrayList
import java.util.ArrayList;

public class RustyInteger{
    private int rusty;
    RustyInteger(int x) {
        this.rusty = x;
    }    

    public int getRusty() {
        return this.rusty;
    }

    public void setRusty(int x) {
        this.rusty = x;
    }

    public boolean isEven() {
        return (this.rusty % 2 == 0);
    }

    public boolean isOdd() {
        return !(this.rusty % 2 == 0);
    }

    public boolean isPrime() {
        //int set to half of the value
        int half = this.rusty/2;
        //int set to hold a test value
        int test = 0;
        if(this.rusty < 2) {
            return false;
        }else{
            for(int i = 2; i <= half; i++) {
                if(this.rusty % i == 0) {
                    test = 1;
                    break;
                }
            }
        } 
        if(test == 0) {
            return true;
        }else {
            return false;
        }
    }


    static boolean isEven(int x) {
        return (x % 2 == 0);
    }

    static boolean isOdd(int x) {
        return !(x % 2 ==0);
    }

    static boolean isPrime(int x) {
        //int set to half of the value
        int half = x/2;
        //int set to hold a test value
        int test = 0;
        if(x < 2) {
            return false;
        }else{
            for(int i = 2; i <= half; i++) {
                if(x % i == 0) {
                    test = 1;
                    break;
                }
            }
        } 
        if(test == 0) {
            return true;
        }else {
            return false;
        }
    }

    static boolean isEven(Integer x) {
        return (Integer.valueOf(x) % 2 == 0);
    }

    static boolean isOdd(Integer x) {
        return !(Integer.valueOf(x) % 2 ==0);
    }

    static boolean isPrime(Integer x) {
        //int to hold the value of Integer
        int val = Integer.valueOf(x);
        //int set to half of the value
        int half = val/2;
        //int set to hold a test value
        int test = 0;
        if(val < 2) {
            return false;
        }else{
            for(int i = 2; i <= half; i++) {
                if(val % i == 0) {
                    test = 1;
                    break;
                }
            }
        } 
        if(test == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean equals(int x) {
        return(x == this.rusty);
    }

    public boolean equals(Integer x) {
        return(Integer.valueOf(x) == this.rusty);
    }

    public static void main(String [] args){
        Integer iX = new Integer(45);
        RustyInteger one = new RustyInteger(3);
        RustyInteger two = new RustyInteger(iX);
        RustyInteger three = new RustyInteger(3);

        System.out.println("\n\nTesting first object with value of int 3: ");
        System.out.println("Is even: " + one.isEven());
        System.out.println("Is odd: " + one.isOdd());
        System.out.println("Is prime: " + one.isPrime());

        System.out.println("\n\nTesting second object with value of Integer 45: ");
        System.out.println("Is even: " + two.isEven());
        System.out.println("Is odd: " + two.isOdd());
        System.out.println("Is prime: " + two.isPrime());

        System.out.println("\n\nTesting third object with value of int 3: ");
        System.out.println("Is even: " + three.isEven());
        System.out.println("Is odd: " + three.isOdd());
        System.out.println("Is prime: " + three.isPrime());

        System.out.println("\n\nTesting static int methods with values 5, 5, and 17: ");
        System.out.println("Is even: " + RustyInteger.isEven(5));
        System.out.println("Is odd: " + RustyInteger.isOdd(5));
        System.out.println("Is prime: " + RustyInteger.isPrime(17));

        System.out.println("\n\nTesting static Integer methods with values 5, 5, and 17: ");
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        Integer i3 = new Integer(17);
        System.out.println("Is even: " + RustyInteger.isEven(i1));
        System.out.println("Is odd: " + RustyInteger.isOdd(i2));
        System.out.println("Is prime: " + RustyInteger.isPrime(i3));

        System.out.println("\n\nTesting int equals method with value 5 after setting value to 5: ");
        one.setRusty(5);
        System.out.println(one.equals(5));
        System.out.println("Testing int equals method with value 5 after setting value to 10: ");
        one.setRusty(10);
        System.out.println(one.equals(5));

        System.out.println("\n\nTesting Integer equals method for Integer value 5 after setting value to 5: ");
        two.setRusty(5);
        System.out.println(two.equals(i1));
        System.out.println("Testing Integer equals method for Integer value 5 after setting value to 10: ");
        two.setRusty(10);
        System.out.println(two.equals(i1));
    }
}

    

