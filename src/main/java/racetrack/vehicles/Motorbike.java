package racetrack.vehicles;

import racetrack.person.Driver;

public class Motorbike extends Vehicle{

    public Motorbike(String make, String model, int speed, Driver driver){
        super(make, model, speed, driver);
    }


    public int drive() {
        return 3;
    }
}
