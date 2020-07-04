/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**
 *
 * @author Osk , Gilmar
 */
public class AirPlane {

    //Here is all my variables that we decided to use to create a flight, 
    private String make;
    private int model;
    private int capacity;
    private Pilot pilot;
    private int aircraftNumber;

    /**
     * Constructor receiving the parameters that we used to create the AirPlane.
     *
     * @param make
     * @param model
     * @param capacity
     * @param aircraftNumber
     */
    public AirPlane(String make, int model, int capacity, int aircraftNumber) {

        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.aircraftNumber = aircraftNumber;

    }

    public AirPlane() {

    }

    //getters and setters
    public Pilot getPilot() {
        return pilot;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int capacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAircraftNumber() {
        return aircraftNumber;
    }

    public void setAircraftNumber(int aircraftNumber) {
        this.aircraftNumber = aircraftNumber;
    }

    /**
     * assignPilot method used to assign a pilot to an airplane, we throw a
     * exception that we created to throw a error massage in case that the pilot
     * cant be assigned we called the method "isAllowed" to check if the pilot
     * has enough experience, to fly the airplane with a certain capacity
     *
     * @param pilot
     * @throws cctair.PilotNotAllowedException
     */
    public void assignPilot(Pilot pilot) throws PilotNotAllowedException {
        if (isAllowed(pilot)) {
            pilot.hasAnPlane = true;
            this.pilot = pilot;
        } else {
            throw new PilotNotAllowedException();
        }

    }

    /**
     * that method returns a boolean, in case the pilot has enough experience and
     * according to the aircraft capacity and if the pilot does not have an
     * AirPlane yet(hasAnPlane) will return true
     */
    private boolean isAllowed(Pilot pilot) {

        boolean allowedConditionOfCapacity = false;
        if (this.capacity <= 250) {
            allowedConditionOfCapacity = pilot.getExperience() >= 1;
        } else if (this.capacity <= 350) {
            allowedConditionOfCapacity = pilot.getExperience() >= 4;
        } else {
            allowedConditionOfCapacity = pilot.getExperience() >= 6;
        }

        return allowedConditionOfCapacity && !pilot.hasAnPlane;
    }

    //to String method
    @Override
    public String toString() {
        return "Aircraft: " + make + " " + model + "\n"
                + "Capacity: " + capacity + " seats" + "\n"
                + "Pilot: " + pilot + "\n";

    }

}
