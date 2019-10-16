package racetrack.vehicles;

import racetrack.IDrive;
import racetrack.person.Driver;

public abstract class Vehicle implements IDrive {

    String make;
    String model;
    int speed;
    Driver driver;


    public Vehicle(String make, String model, int speed, Driver driver) {
        this.make = make;
        this.model = model;
        this.speed = speed;
        this.driver = driver;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public Driver getdriver(){
        return this.driver;
    };
}
