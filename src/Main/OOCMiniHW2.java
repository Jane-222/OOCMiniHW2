/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import oocminihw2.Drivable;
import oocminihw2.Flyable;
import oocminihw2.Sailable;
import oocminihw2.Vehicle;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the abstract Vehicle class
        Vehicle myVehicle = new Vehicle(60, "Car", "Sports Car", 2) {
            @Override
            public void start() {
                System.out.println("Vehicle is starting.");
            }

            @Override
            public void stop() {
                System.out.println("Vehicle is stopping.");
            }
        };

        // Start the vehicle
        myVehicle.start();

        // Accelerate the vehicle
        myVehicle.setSpeed(80);

        // Turn the vehicle
        myVehicle.setDirection(45);

        // Print vehicle information
        System.out.println("Make: " + myVehicle.getMake());
        System.out.println("Type: " + myVehicle.getType());
        System.out.println("Speed: " + myVehicle.getSpeed());
        System.out.println("Direction: " + myVehicle.getDirection());
        System.out.println("Number of Passengers: " + myVehicle.getNumPassengers());

        // Stop the vehicle
        myVehicle.stop();

        // Test Drivable methods
        System.out.println("Driving...");
        Drivable drivableVehicle = (Drivable) myVehicle;
        drivableVehicle.accelerate(50);
        drivableVehicle.turn(30);
        System.out.println("Direction: " + drivableVehicle.getDirection());
        System.out.println("Speed: " + drivableVehicle.getSpeed());

        // Test Flyable methods
        System.out.println("Taking off...");
        Flyable flyableVehicle = (Flyable) myVehicle;
        flyableVehicle.changeAltitude(10000);
        System.out.println("Altitude: " + flyableVehicle.getAltitude());

        // Test Sailable methods
        System.out.println("Hoisting sail...");
        Sailable sailableVehicle = (Sailable) myVehicle;
        sailableVehicle.hoistSail();
        System.out.println("Sail Hoisted: " + sailableVehicle.isSailHoisted());
        sailableVehicle.lowerSail();
        System.out.println("Sail Hoisted: " + sailableVehicle.isSailHoisted());
    }
}
