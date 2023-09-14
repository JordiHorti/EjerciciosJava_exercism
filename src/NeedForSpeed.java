/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;     
        this.distanceDriven = 0;
        this.battery = 100;
    }
    public int getSpeed(){
        return speed;
    }
    public int getBatteryDrain(){
        return  batteryDrain;
    }  
    public boolean batteryDrained() {
        return this.battery <= 0; 
    }
    public int distanceDriven() {
        return this.distanceDriven;
    }
    public void drive() {     
        if(batteryDrained()){
            System.out.println("Battery Empty");
            return;
        }else{
            this.distanceDriven += this.speed;
            this.battery -= batteryDrain;
        }

    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}
class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }
    
    public boolean tryFinishTrack(NeedForSpeed car) {
        return (100 / car.getBatteryDrain()) * car.getSpeed() >= this.distance;
    }
       
}

