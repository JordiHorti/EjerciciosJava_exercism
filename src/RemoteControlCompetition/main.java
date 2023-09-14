/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RemoteControlCompetition;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jordi
 */
public class main {
    public static void main(String[] args) {
        ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
        prod.drive();
        int distance = prod.getDistanceTravelled();
        ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
        exp.drive();
        int distanceExp = exp.getDistanceTravelled();
        TestTrack.race(new ProductionRemoteControlCar());
        TestTrack.race(new ExperimentalRemoteControlCar());
        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(3);
        prc2.setNumberOfVictories(2);
        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(prc1);
        unsortedCars.add(prc2);
        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
        int victories = 0;
        for (ProductionRemoteControlCar car : rankings) {
            victories += car.getNumberOfVictories();
        }
        System.out.println("Victorias: " + victories);

        System.out.println("Distance: " + distance + "\n" + "Distance Experimental: " + distanceExp );
    }
   
}
