/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public abstract class Vehicle {
    private float speed;
    private float direction = 0;
    private String make;
    private String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    private int numPassengers;

    // Constructor for the Vehicle class
    public Vehicle(float speed, String make, String type, int numPassengers) {
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
    }

    // Abstract method for starting the vehicle
    public abstract void start();

    // Abstract method for stopping the vehicle
    public abstract void stop();

    // Getter and Setter methods for speed
    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    // Getter and Setter methods for direction
    public float getDirection() {
        return direction;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    // Getter and Setter methods for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and Setter methods for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter methods for numPassengers
    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}

