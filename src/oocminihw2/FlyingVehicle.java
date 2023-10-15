/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author zhiya
 */
public class FlyingVehicle implements Flyable {
    // Implement Drivable methods
    @Override
    public void accelerate(float speed) {
        // Implement acceleration logic for driving
    }

    @Override
    public void brake() {
        // Implement braking logic for driving
    }

    @Override
    public void turn(float angle) {
        // Implement turning logic for driving
    }

    @Override
    public float getDirection() {
        // Implement getDirection logic for driving
        return 0;
    }

    @Override
    public float getSpeed() {
        // Implement getSpeed logic for driving
        return 0;
    }

    // Implement Flyable methods
    @Override
    public void changeAltitude(float change) {
        // Implement altitude change logic for flying
    }

    @Override
    public float getAltitude() {
        // Implement getAltitude logic for flying
        return 0;
    }

    // Additional methods or attributes specific to FlyingVehicle

    @Override
    public String getMake() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
