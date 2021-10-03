/*
Rusty Degarmo
Professor Payne
Intermediate Java Programming
14 August 2021
*/


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

        //test getters
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