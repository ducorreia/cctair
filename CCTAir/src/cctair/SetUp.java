/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;

import java.util.Random;

/**
 *
 * @author Osk , Gilmar
 */
public class SetUp {

    Random rGen = new Random();
    
    ArrayList<Flight> allFlights = new ArrayList<Flight>();
   
    /**
    // method used to create the airplanes, using array to store the parameters,
    //and for loop to store these in a variable.
    //while loop used to assign a random pilot and test if they are able to fly the airplane
     * @param airplanes
     * @param pilots
     * @return 
    */
    public AirPlane[] createAirPlanes(AirPlane[] airplanes, Pilot[] pilots) {
        String makes = "Boing";
        int[] models = {747, 744, 741, 756, 746, 742};
        int[] capacities = {200, 250, 300, 350, 400};

        for (int i = 0; i < airplanes.length; i++) {

            int randomModel = models[rGen.nextInt(models.length)];
            int randomCapacity = capacities[rGen.nextInt(capacities.length)];
            int aircraftNumber = 100 + i;
            airplanes[i] = new AirPlane(makes, randomModel, randomCapacity, aircraftNumber);

            boolean foundPilot = false;
            while (!foundPilot) {
                Pilot randomPilot = pilots[rGen.nextInt(pilots.length)];

                try {

                    airplanes[i].assignPilot(randomPilot);

                    foundPilot = true;
                } catch (PilotNotAllowedException e) {
                    
                }

            }

            
        }
        return airplanes;
    }
    
    /**
    //method used to create pilots using array to store the parameters,
    //and for loop to store these in a variable. 
     * @param pilots
     * @return 
    */
    public Pilot[] createPilot(Pilot[] pilots) {

        String[] name = {"Brant Morino", "Jackson Cass", "Eusebio Tavarez", "Issac Quevedo",
            "Shane Geiser", "Rodrick Jacobus", "Hans Broce", "Frank Ritchey", "Ward Seckman",
            "Maximo Monsour", "Chas Reeb", "Moesha Barton", "Safia Rojas", "Georgiana Watt", "Reginald Feeney",
            "Farzana Akhtar", "Dawn Mccormick", "Markus Reyna", "Jean Durham", "Milly Blanchard"};

        int[] experience = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = 0; i < pilots.length; i++) {

            pilots[i] = new Pilot();
        
            pilots[i].setName(name[rGen.nextInt(name.length)]);
            pilots[i].setExperience(experience[rGen.nextInt(experience.length)]);
            pilots[i].setId(100 + i);

        }
        return pilots;
    }
    /**
    //method used to create fligths using arraylist
     * @param airplanes
     * @return 
    */
    public ArrayList<Flight> createFlight(AirPlane[] airplanes) {
        
        this.allFlights.add(new Flight("Dublin", "Barcelona", "03-01-2020", airplanes[0]));
        this.allFlights.get(0).scheduled("06:15", "09:45");

        this.allFlights.add(new Flight("Dublin", "Lisbon", "03-01-2020", airplanes[1]));
        this.allFlights.get(1).scheduled("17:25", "20:15");

        this.allFlights.add(new Flight("Dublin", "Paris", "02-01-2020", airplanes[2]));
        this.allFlights.get(2).scheduled("11:00", "12:40");

        this.allFlights.add(new Flight("Dublin", "Amsterdam", "02-01-2020", airplanes[3]));
        this.allFlights.get(3).scheduled("15:30", "17:15");

        this.allFlights.add(new Flight("Dublin", "Liverpool", "05-01-2020", airplanes[4]));
        this.allFlights.get(4).scheduled("10:00", "10:55");

        this.allFlights.add(new Flight("Dublin", "Bristol", "05-01-2020", airplanes[5]));
        this.allFlights.get(5).scheduled("11:00", "12:10");

        this.allFlights.add(new Flight("Dublin", "Manchester", "05-01-2020", airplanes[6]));
        this.allFlights.get(6).scheduled("10:00", "11:05");

        this.allFlights.add(new Flight("Dublin", "Pisa", "05-01-2020", airplanes[7]));
        this.allFlights.get(7).scheduled("12:00", "14:45");

        this.allFlights.add(new Flight("Dublin", "Zadar", "05-01-2020", airplanes[8]));
        this.allFlights.get(8).scheduled("07:00", "11:05");

        this.allFlights.add(new Flight("Dublin", "Kyvi", "05-01-2020", airplanes[9]));
        this.allFlights.get(9).scheduled("18:00", "21:50");

        this.allFlights.add(new Flight("Dublin", "Athens", "02-01-2020", airplanes[10]));
        this.allFlights.get(10).scheduled("06:00", "10:25");

        this.allFlights.add(new Flight("Dublin", "Krakow", "05-01-2020", airplanes[11]));
        this.allFlights.get(11).scheduled("20:00", "23:00");

        this.allFlights.add(new Flight("Dublin", "Brussels", "05-01-2020", airplanes[12]));
        this.allFlights.get(12).scheduled("18:00", "19:45");

        this.allFlights.add(new Flight("Dublin", "Göteborg Landvetter", "02-01-2020", airplanes[13]));
        this.allFlights.get(13).scheduled("09:00", "11:10");

        this.allFlights.add(new Flight("Dublin", "Porto", "01-01-2020", airplanes[14]));
        this.allFlights.get(14).scheduled("10:00", "12:25");

       
        return this.allFlights;

    }

}
