/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Osk , Gilmar
 */
public class Logic {
    //creating the objects to get input from the client and a flight object.

    Scanner askUser = new Scanner(System.in);
    Flight f = new Flight();

    /**
     * //method used to check if the date format is correct.
     *
     * @param tempUserDate
     * @return
     */
    public static boolean checkDate(String tempUserDate) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(tempUserDate.trim());
        } catch (ParseException pe) {

            return false;
        }
        return true;
    }

    /**
     * method used to avoid the program crashes if the client uses String as a
     * input. 
     */
    private int readInteger() {
        boolean read = false;
        int intVal = 0;
        while (!read) {
            try {
                intVal = askUser.nextInt();
                read = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("--------------------------------------------");
                System.out.println("Please, insert a valid number.");
                askUser.next();
            }
        }
        return intVal;
    }

    /**
     * method used to avoid the client goes forward if the input is an interger.
     * input or null. 
     */
    private String readString() {
        boolean read = false;
        String strVal = null;
        while (strVal == null || strVal.isEmpty()) {
            try {
                strVal = askUser.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("--------------------------------------------");
                System.out.println("Please, insert a valid entry.");
                askUser.next();
            }
        }
        return strVal;
    }

    /**
     * //method used to print all flights
     *
     * @param allFlights
     */
    public void allFlights(ArrayList<Flight> allFlights) {

        System.out.println("Flights available" + "\n");

        for (Flight element : allFlights) {
            System.out.println(element.toString());
        }
    }

    /**
     * //method used to let the client check a specific flight
     *
     * @param allFlights
     */
    public void particularFlight(ArrayList<Flight> allFlights) {

        System.out.println("Destination:");
        System.out.println("--------------------------------------------");

        for (Flight element : allFlights) {

            System.out.println(element.getDestination());

        }
        System.out.println("--------------------------------------------");

        String temp1 = "";
        int temp2 = 0;
        String userFlight;
        do {
            System.out.println("What is your destination?");
            userFlight = askUser.next();
            for (int i = 0; i < allFlights.size(); i++) {
                if (userFlight.equalsIgnoreCase(allFlights.get(i).getDestination())) {
                    temp1 = allFlights.get(i).getDestination();
                    temp2 = i;
                    break;
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("Please, insert a valid destination.");
        } while (!userFlight.equalsIgnoreCase(temp1));
        System.out.println("--------------------------------------------");
        System.out.println("This is the flight chosen:");
        System.out.println(" ");
        System.out.println(allFlights.get(temp2));

    }

    /**
     * //method used to print all airplanes
     *
     * @param airplanes
     */
    public void allAirplanes(AirPlane[] airplanes) {

        System.out.println("Airplanes available." + "\n");
        for (AirPlane element : airplanes) {

            System.out.println(element.toString());

        }

    }

    /**
     * //method used to let the client check a specific airplane
     *
     * @param airplanes
     */
    public void particularAirplane(AirPlane[] airplanes) {

        // ArrayList<Integer> tempAircraftNumber = new ArrayList<Integer>();
        System.out.println("Airplane`s numbers:");
        System.out.println("--------------------------------------------");

        for (AirPlane element : airplanes) {
            System.out.print(element.getAircraftNumber() + " ");
        }

        System.out.println("\n");
        System.out.println("--------------------------------------------");

        int temp1 = 0;
        int temp2 = 0;
        int userAirplane = -1;
        do {
            System.out.println("Which airplane would you like to check? ");
            userAirplane = readInteger();
            for (int i = 0; i < airplanes.length; i++) {
                if (userAirplane == (airplanes[i].getAircraftNumber())) {
                    temp1 = airplanes[i].getAircraftNumber();
                    temp2 = i;
                    break;
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("Please, insert a valid number.");
        } while (userAirplane != temp1);
        System.out.println("--------------------------------------------");
        System.out.println("This is the airplane chosen:");
        System.out.println(" ");
        System.out.println(airplanes[temp2]);

    }

    /**
     * //method used to print all Pilots
     *
     * @param pilots
     */
    public void allPilots(Pilot[] pilots) {

        System.out.println("All the pilots available." + "\n");
        for (Pilot element : pilots) {

            System.out.println(element.toString());

        }

    }

    /**
     * //method used to let the client check a specific pilot
     *
     * @param pilots
     */
    public void particularPiolot(Pilot[] pilots) {

        System.out.println("Pilot`s id numbers :");
        System.out.println("--------------------------------------------");

        for (Pilot element : pilots) {
            System.out.print(element.getId() + " ");

        }
        System.out.println("\n");
        System.out.println("--------------------------------------------");

        int temp1 = 0;
        int temp2 = 0;
        int userPilot;

        do {
            System.out.println("Which pilot would you like to check? ");

            userPilot = readInteger();
            for (int i = 0; i < pilots.length; i++) {
                if (userPilot == pilots[i].getId()) {
                    temp1 = pilots[i].getId();
                    temp2 = i;

                    break;
                }

            }
            System.out.println("--------------------------------------------");
            System.out.println("Please, insert a valid number.");

        } while (userPilot != temp1);
        System.out.println("--------------------------------------------");
        System.out.println("This is the pilot chosen.");
        System.out.println(" ");
        System.out.println(pilots[temp2]);

    }

    /**
     * //method used to let the client creates a flight choosing a destination,
     *  a date and an airplane.
     *
     * @param allFlights
     * @param airplanes
     */
    public void userCreateFlight(ArrayList<Flight> allFlights, AirPlane[] airplanes) {

        int numberOfFlights = 0;
        int count;
        ArrayList<Flight> userFlights = new ArrayList<>();
        System.out.println("--------------------------------------------");
        System.out.println("Welcome !");
        System.out.println("Here you can create flight(s)!");

        System.out.println("--------------------------------------------");
        System.out.println("How many flights would you like to create?");
        do {

            numberOfFlights = askUser.nextInt();
            if (numberOfFlights > 0 && numberOfFlights <= 5) {
                break;
            } else {
                System.out.println("Sorry, you can just create 5 flights");
                System.out.println("Let's try again!");
                System.out.println("How many flights would you like to create?");
            }
        } while (numberOfFlights >= 6);

        for (count = 0; count < numberOfFlights; count++) {
            //Destinaton 
        
            System.out.println("This is your Flight number " + (count + 1));
            System.out.println("--------------------------------------------");

            System.out.println("These are the destinations available: " + "\n");

            for (Flight element : allFlights) {

                System.out.println(element.getDestination());

            }

            System.out.println("--------------------------------------------");
            String tempUserDes = "";
            String temp = "";

            do {
                System.out.println("Please, insert your destination. ");
                tempUserDes = readString();
                for (int i = 0; i < allFlights.size(); i++) {
                    if (tempUserDes.equalsIgnoreCase(allFlights.get(i).getDestination())) {
                        temp = allFlights.get(i).getDestination();
                        break;
                    }

                }
                System.out.println("--------------------------------------------");

            } while (!tempUserDes.equalsIgnoreCase(temp));

            //Day and month 
            System.out.println("--------------------------------------------");

            String tempUserDate;

            System.out.println("Please, type a valid date (dd-mm)");

            do {
                tempUserDate = askUser.nextLine();

                if (checkDate(tempUserDate)) {
                    break;
                } else {
                    System.out.println("--------------------------------------------");
                    System.out.println("Please, insert a valid date(dd-mm)");
                }

            } while (!checkDate(tempUserDate));

            //year
            System.out.println("--------------------------------------------");
            System.out.println("Insert a valid year(yyyy)");
            System.out.println("--------------------------------------------");
            int tempUserYear;
            while (true) {

                tempUserYear = readInteger();
                if (tempUserYear > 2019 && tempUserYear < 2021) {

                    break;
                } else  if (tempUserYear > 2020) {
                    System.out.println("Sorry, the flight can not be created because it exceeds the period of a year.");
                    System.out.println("Please insert a valid year");
                    System.out.println("Note: The year-limit of the flights available is 2020.");
                   

                } else {
                     System.out.println("A flight with a date before the current date can not be created.");
                    System.out.println("Please, insert a valid year (yyyy)");
                   
                 
                   
                }

            }
            System.out.println("--------------------------------------------");
            String userDate = tempUserDate + "-" + tempUserYear;

            //Airplane 
            System.out.println("Airplanes`numbers");
            System.out.println("--------------------------------------------");
            for (AirPlane element : airplanes) {

                System.out.print(element.getAircraftNumber() + " ");

            }

            int tempUserNumber;
            int tempNumber = 0;
            int indexAirplane = 0;
            System.out.println(" ");
            System.out.println("--------------------------------------------");
            System.out.println("Please, choose an airplane's number");
            do {

                tempUserNumber = readInteger();
                System.out.println("--------------------------------------------");

                for (int i = 0; i < airplanes.length; i++) {

                    if (tempUserNumber == airplanes[i].getAircraftNumber()) {
                        tempNumber = airplanes[i].getAircraftNumber();
                        indexAirplane = i;
                        break;
                    } else {
                        System.out.println("--------------------------------------------");
                        System.out.println("Please, insert a valid number.");
                    }

                }

            } while (tempUserNumber != tempNumber);
            AirPlane[] userAirplane = new AirPlane[1];

            userAirplane[0] = airplanes[indexAirplane];

            userFlights.add(new Flight("Dublin", tempUserDes, userDate, userAirplane[0]));
            userFlights.get(count).scheduled("06:15", "09:45");

        }
        System.out.println("Thank you !" + "\n");
        System.out.println("The new flight was created successfully !");
        System.out.println("New flight(s):" + "\n");
        for (Flight element : userFlights) {
            System.out.println(element.toString());
        }
    }
}
