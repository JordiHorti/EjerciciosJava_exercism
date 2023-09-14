/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class CarsAssemble {
    
    public double productionRatePerHour(int speed) {
        if(speed <= 10 && speed > 0){
            switch(speed){
                case 1:
                    return 221.0;
                case 2:
                    return 221.0 * 2.0;
                case 3:
                    return 221.0 * 3.0;
                case 4:
                    return 221.0 * 4.0;
                case 5: 
                    return (221.0 * 0.9) * 5.0;
                case 6:
                    return (221.0 * 0.9) * 6.0;
                case 7:
                    return (221.0 * 0.9) * 7.0;
                case 8:
                    return  (221.0 * 0.9) * 8.0;
                case 9:
                    return (221.0 * 0.8) * 9.0;
                case 10:
                    return (221.0 * 0.77) * 10.0;
                default:
                    speed = 10;
                    return (221.0 * 0.77) * 10.0;
            }
        }else{
            return 0.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        
        if(speed <= 10 && speed > 0){
             switch(speed){
                case 1:
                    return 221 / 60;
                case 2:
                    return (221 * 2)/60;
                case 3:
                    return (221 * 3)/60;
                case 4:
                    return (221 * 4)/60;
                case 5: 
                    return (int)((221 * 0.9) * 5)/60;
                case 6:
                    return (int)((221 * 0.9) * 6)/60;
                case 7:
                    return (int)((221 * 0.9) * 7)/60;
                case 8:
                    return (int) ((221 * 0.9) * 8)/60;
                case 9:
                    return (int)((221 * 0.8) * 9)/60;
                case 10:
                    return (int)((221 * 0.77) * 10)/60;
                
            }
        }else if(speed > 10){
            speed = 10;      
        }
        return (speed * 221) / 60;
    }
    public static void main(String[] args) {
        CarsAssemble cA = new CarsAssemble();
        
        double production = cA.productionRatePerHour(6);
        
        System.out.println(production);
    }
}


