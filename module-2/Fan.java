/*
Rusty Degarmo
Professor Payne
Intermediate Java Programming
14 August 2021
*/

//import ArrayList
import java.util.ArrayList;

public class Fan{
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = STOPPED;
    private boolean on;
    private int radius = 6;
    private String color = "white";

    //getters
    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    //setters
    public void setSpeed(int spd) {
        this.speed = spd;
    }

    public void setOn(boolean isOn) {
        this.on = isOn;
    }

    public void setRadius(int rad) {
        this.radius = rad;
    }

    public void setColor(String col) {
        this.color = col;
    }

    //A default constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    //A constructor taking arguments
    public Fan(int spd, boolean isOn, int rad, String col) {
        this.speed = spd;
        this.on = isOn;
        this.radius = rad;
        this.color = col;
    }

    public String toString() {
        //translate the boolean on to a string on/off
        String isOn = "";
        if(this.on == true){
            isOn = "On";
        }else{
            isOn = "Off";
        }

        //the string to hold the status
        String status = "";
        status += ("The current status of the fan is: ");
        status += ("\nFan On/Off: " + isOn);
        status += ("\nFan Speed Setting: " + this.speed);
        status += ("\nFan Radius Size: " + this.radius + " inches");
        status += ("\nFan Color: " + this.color);
        return status;
    }


    public static void main(String [] args){
        //create some space
        System.out.println("\n\n");

        //creating and printing a default fan
        Fan fan = new Fan();
        System.out.println("The Default Fan: ");
        System.out.println(fan);

        //more space
        System.out.println("\n\n");

        //creating and printing a custom fan
        Fan fanTwo = new Fan(2, true, 5, "black");
        System.out.println("The Custom Fan: ");
        System.out.println(fanTwo);

        //space
        System.out.println("\n\n");

        //creating some more fans
        Fan fanThree = new Fan(3, false, 3, "red");
        Fan fanFour = new Fan(1, true, 10, "blue");
        Fan fanFive = new Fan(0, false, 4, "yellow");

        //create a collection for our new fans
        ArrayList<Fan> fans = new ArrayList<Fan>();
        fans.add(fanThree);
        fans.add(fanFour);
        fans.add(fanFive);

        System.out.println("TEST displayFans() WITH OUR COLLECTION:");
        UseFans.displayFans(fans);

        System.out.println("\n\n");
        System.out.println("TEST displayFan() WITH OUR TWO PREVIOUS FANS");
        UseFans.displayFan(fan);
        UseFans.displayFan(fanTwo);



        //Module 1 tests
        //test getters
        System.out.println("\n\nMODULE ONE GETTER/SETTER TESTS: ");
        System.out.println("First Fan Getter Methods:");
        System.out.println("The fan is on: " + fan.getOn());
        System.out.println("The fan speed is: " + fan.getSpeed());
        System.out.println("The fan size is: " + fan.getRadius());
        System.out.println("The fan color is: " + fan.getColor());

        //test setters
        fan.setOn(true);
        fan.setSpeed(3);
        fan.setRadius(10);
        fan.setColor("Green");

        //test getters with the new values
        System.out.println("\n\nFirst Fan Getters After Setters:");
        System.out.println("The fan is on: " + fan.getOn());
        System.out.println("The fan speed is: " + fan.getSpeed());
        System.out.println("The fan size is: " + fan.getRadius());
        System.out.println("The fan color is: " + fan.getColor());
        System.out.println("\n\n");



    }
}

//UseFans Class
class UseFans {
        
    //method for displaying a collection of fans
    public static void displayFans(ArrayList<Fan> fans) {
        for(int i = 0; i < fans.size(); i++){
            String isOn = "";
            if(fans.get(i).getOn() == true){
                isOn = "On";
            }else{
                isOn = "Off";
            }

            System.out.println("\n\nFan Status: ");
            System.out.println("Fan On/Off: " + isOn);
            System.out.println("Fan Speed Setting: " + fans.get(i).getSpeed());
            System.out.println("Fan Radius Size: " + fans.get(i).getRadius() + " inches");
            System.out.println("Fan Color: " + fans.get(i).getColor());
        }
    }

    //method for displaying a single fan
    public static void displayFan(Fan fan) {
        String isOn = "";
        if(fan.getOn() == true){
            isOn = "On";
        }else{
            isOn = "Off";
        }

        System.out.println("\n\nFan Status: ");
        System.out.println("Fan On/Off: " + isOn);
        System.out.println("Fan Speed Setting: " + fan.getSpeed());
        System.out.println("Fan Radius Size: " + fan.getRadius() + " inches");
        System.out.println("Fan Color: " + fan.getColor());
    }
}

    

