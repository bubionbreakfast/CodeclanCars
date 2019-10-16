package racetrack.vehicles;

public class Car extends Vehicle {


    public Car(String make, String model, int speed){
        super(make, model, speed);

    }

    public int drive() {
        return 2;
    }
}
