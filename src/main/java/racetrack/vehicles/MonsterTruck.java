package racetrack.vehicles;

import racetrack.person.Driver;

public class MonsterTruck extends Vehicle{



    public MonsterTruck(String make, String model, int speed, Driver driver){
        super(make, model, speed, driver);
    }

    public int drive() {
        return 1;
    }
}
