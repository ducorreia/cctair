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
/**
//method used to throw an exception when a pilot is not allowed to fly an airplane.
*/
public class PilotNotAllowedException extends Exception {
    
    public PilotNotAllowedException(){
        
        super("Pilot not allowed");
    }
}
