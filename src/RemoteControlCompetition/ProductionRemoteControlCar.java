/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RemoteControlCompetition;

/**
 *
 * @author jordi
 */

import java.util.List;

public class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
    private int distance;
    private int victories;
    private List<ProductionRemoteControlCar> unsortedCars; 
    
   
    @Override
    public void drive() {
        this.distance += 10;
    }  
    @Override
    public int getDistanceTravelled() {
        return this.distance; 
    }
    public int getNumberOfVictories() {
        return this.victories; 
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories; 
    }
    public void addCarsToList(ProductionRemoteControlCar newCar){
        unsortedCars.add(newCar);
    }
    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(otherCar.victories, this.victories);
    }
    
}

