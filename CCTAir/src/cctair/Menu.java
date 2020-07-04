/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;

/**
 *
 * @author Osk , Gilmar
 */
public class Menu {
    //instantiating the Logic class to call the methods from there
    Logic logic = new Logic();
    /**
    //method used to create the menu using the switch/case to let the client chooses an option that the want.
     * @param option
     * @param pilots
     * @param airplanes
     * @param allFlights
     * @param flight
    */
    public void CCTAirMenu(int option, Pilot[] pilots, AirPlane[] airplanes, ArrayList<Flight> allFlights, Flight flight) {

        switch (option) {

            case 1:
                //Calling the method from logic class
                logic.allFlights(allFlights);

                break;

            case 2:
                //Calling the method from logic class
                logic.particularFlight(allFlights);

                break;
            case 3:
                //Calling the method from logic class
                logic.allAirplanes(airplanes);

                break;

            case 4:
                //Calling the method from logic class
                logic.particularAirplane(airplanes);

                break;

            case 5:
                //Calling the method from logic class
                logic.allPilots(pilots);

                break;

            case 6:
                //Calling the method from logic class
                logic.particularPiolot(pilots);

                break;

            case 7:
                //Calling the method from logic class
                logic.userCreateFlight(allFlights, airplanes);

                break;

            case 8:
                System.exit(0);

            default:
                System.out.println("--------------------------------------------");

                System.out.println("Invalid option, please chose another option");
                System.out.println("--------------------------------------------");

        }

    }
}
