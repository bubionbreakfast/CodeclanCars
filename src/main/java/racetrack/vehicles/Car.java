package racetrack.vehicles;

import racetrack.person.Driver;

public class Car extends Vehicle {


    public Car(String make, String model, int speed, Driver driver){
        super(make, model, speed, driver);

    }

    public int drive() {
        return 2;
    }
}
