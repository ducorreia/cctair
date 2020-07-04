/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Osk , Gilmar
 */
public class CCTAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //here are my objects 
        Scanner askUser = new Scanner(System.in);
        SetUp set = new SetUp();
        Flight f = new Flight();
        Menu menu = new Menu();
        AirPlane airplane = new AirPlane();
        
        //creating arrays and arraylist
        Pilot[] pilots = new Pilot[20];
        AirPlane[] airplanes = new AirPlane[15];
        ArrayList<Flight> flights = new ArrayList<>();
        
        //Creating pilots, airplanes and flights
        pilots = set.createPilot(pilots);
        airplanes = set.createAirPlanes(airplanes, pilots);
        flights = set.createFlight(airplanes);
        int option;
        System.out.println("--------------------------------------------");
        System.out.println("welcome to the CCTAir company!!" + "\n We are a new company in the market and we are starting our operations from January 2020");
        System.out.println("--------------------------------------------");
        System.out.println("Chose the options below");
        
        //using a do/while loop to keep calling the menu every time that the client finishes a task.
        
        do {
            System.out.println("--------------------------------------------");
            System.out.println("1- To check all flights on the system");
            System.out.println("2- To view a particular Flight");
            System.out.println("3- To check all airplane on the system");
            System.out.println("4- To view a particular aircraft");
            System.out.println("5- To check view all Pilots");
            System.out.println("6- To view a particular Pilot");
            System.out.println("7- To create a flight(s)");
            System.out.println("8- To exit.");
            System.out.println("--------------------------------------------");

            option = askUser.nextInt();

            menu.CCTAirMenu(option, pilots, airplanes, flights, f);

        } while (option != 8);

    }
}
