package racetrack;

import racetrack.person.Driver;

import java.util.ArrayList;

public class RaceTrack {

    String name;
    int distance;
    ArrayList<IDrive> vehicles;
    ArrayList<Driver> drivers;

    public RaceTrack(String name, int distance){
        this.name = name;
        this.distance = distance;
        this.vehicles = new ArrayList<IDrive>();
        this.drivers = new ArrayList<Driver>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void addVehicleToRaceTrack(IDrive vehicle){
        this.vehicles.add(vehicle);
    }


    public int getVehicleCount() {
        return this.vehicles.size();
    }

    public void addDriverToRaceTrack(Driver driver) {
        this.drivers.add(driver);
    }

    public int getDriverCount() {
        return this.drivers.size();
    }
}
