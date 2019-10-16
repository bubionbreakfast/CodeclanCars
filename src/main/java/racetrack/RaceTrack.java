package racetrack;

import racetrack.person.Driver;
import racetrack.vehicles.Car;
import racetrack.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Collections;

public class RaceTrack {

    String name;
    int distance;
    ArrayList<Vehicle> vehicles;
    ArrayList<Driver> drivers;

    public RaceTrack(String name, int distance){
        this.name = name;
        this.distance = distance;
        this.vehicles = new ArrayList<Vehicle>();
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

    public void addVehicleToRaceTrack(Vehicle vehicle){
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

    public void addDriversToVehicles(Vehicle vehicle, Driver driver){
        vehicle.setDriver(driver);
    }


    public ArrayList getWinner() {
        ArrayList rankings = new ArrayList();
        for (Vehicle vehicle : this.vehicles){
          int performance = vehicle.getPerformance();
          rankings.add(performance);
          Collections.sort(rankings);
//          return rankings;

        }
        return rankings;
    }
}
