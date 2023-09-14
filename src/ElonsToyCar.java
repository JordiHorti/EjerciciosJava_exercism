/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class ElonsToyCar {
    private int meters = 0;
    private int percentage = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + this.meters + " meters";
    }

    public String batteryDisplay() {

        return percentage <= 0 ? "Battery empty" : "Battery at " + this.percentage + "%";
    }

      public void drive() {
          if (percentage > 0) {
            meters += 20;
            if (meters > 2000) {
                meters = 2000;
            }
            percentage--;
        } else if (percentage <= 0 && meters <= 2000) {
            meters = 2000;
            percentage = 0;
        }
    }   
    public static void main(String[] args) {
        
        ElonsToyCar car = ElonsToyCar.buy();
        
        car.drive();
        
        String distance = car.distanceDisplay();
        
        String battery = car.batteryDisplay();  
        
        System.out.println(distance + "\n" + battery);
        
    }
}

