package racetrack.vehicles;

public class Motorbike extends Vehicle{

    public Motorbike(String make, String model, int speed){
        super(make, model, speed);
    }


    public int drive() {
        return 3;
    }
}
