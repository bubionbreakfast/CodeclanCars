package racetrack.vehicles;

public abstract class Vehicle {

    String make;
    String model;
    int speed;

    public Vehicle(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
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
}
