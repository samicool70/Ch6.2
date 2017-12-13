package cargame;

/**
 * Created by User on 11/21/2017.
 */

public class Car {
    public String color;
    public String make;
    private double speed;

    public Car() {
        make = "Ferrari";
        color="Red";
        speed=0;
    }
    public double move(double speed, int time) {
        double distance = 0;
        distance = speed * time;
        return distance;
    }
    public String toString(){
        return "Make: "+make +"\n"+ "Color: "+ color +"\n"+"Speed: "+speed;
    }
}