/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**
 *
 * @author Osk , Gilmae
 */

public class Flight{
    // Here is all the variables that we decided to use to create a flight, 
    
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String dateOfFlight;
    private AirPlane airplane;
     
    /**
    *The Constructor is receiving the parameters that we use to create the flight,
    *we did not use the arrivalTime and departureTime as requested.
     * @param origin
     * @param destination
     * @param dateOfFlight
     * @param airplane
    */
    public Flight(String origin, String destination, String dateOfFlight, AirPlane airplane) {

        this.origin = origin;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
        this.airplane = airplane;
        
    }

    public Flight() {
    }
    
    
     //Getters and setters
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

   

    public String getArrivalTime() {
        return arrivalTime;
    }

  
    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }
    /**
    //scheduled method to update the arrivalTime
     * @param arrivalTime
    */
    public void scheduled(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    /**
    //scheduled method to set the arrivalTime and departureTime
     * @param departureTime
     * @param arrivalTime
    */
    public void scheduled ( String departureTime, String arrivalTime){
        
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
    
    
    
    

    
    
    //toString method
    @Override
    public String toString() {
        return 
                "Flight Information: " +"\n"+
                "Date: " + dateOfFlight+ "\n"+
                "From: " + origin + " to "+ destination +"\n"+
                "Flight time: " + departureTime +  " to " + arrivalTime+"\n"+
                "Plane Information: " +"\n"+
                airplane + "\n" ;
                        
    }

}


