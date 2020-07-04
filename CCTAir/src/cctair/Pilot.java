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
public class Pilot {

    // Here is all the variables that we decided to use, 
    //"hasAnPlane" we used to check if the pilot already had a airplane.
    private String name;
    private int experience;
    private int id;
    public boolean hasAnPlane;
    /**
    //Constructor receiving the parameters that we used to create the pilot
     * @param name
     * @param experience
     * @param id
    */
    public Pilot(String name, int experience, int id) {

        this.name = name;
        this.experience = experience;
        this.id = id;
        this.hasAnPlane = false;
    }

    public Pilot() {
    }
    
    //Getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    //toString method
    @Override
    public String toString() {
        return "Pilot{" + "name: " + name + ", Experience: " + experience + " Years" + " ID: " + id + " }\n";
    }

}
