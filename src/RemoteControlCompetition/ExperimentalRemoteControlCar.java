/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RemoteControlCompetition;

/**
 *
 * @author jordi
 */
public class ExperimentalRemoteControlCar implements RemoteControlCar {
     private int distance;
    private int victories;
    
   
    public void drive() {
        this.distance += 20; 
    }  
    public int getDistanceTravelled() {
        return this.distance;
    }   
}
