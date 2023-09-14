/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int expectedMinutes = 40;
        System.out.println("Tiempo de cocción esperado: " + expectedMinutes + " minutos");
        return expectedMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes) {
        int remainingMinutes = expectedMinutesInOven() - minutes;
        System.out.println("Tiempo restante en el horno: " + remainingMinutes + " minutos");
        return remainingMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        int preparationTime = layers * 2;
        System.out.println("Tiempo de preparación por capa: " + preparationTime + " minutos");
        return preparationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutes) {
        int preparationTime = preparationTimeInMinutes(layers);
        int totalTime = preparationTime + minutes;
        System.out.println("Tiempo total de cocinado: " + totalTime + " minutos");
        return totalTime;
    }

    public static void main(String[] args) {
        int minutes = 30;
        int layers = 2;

        Lasagna ls = new Lasagna();

        ls.expectedMinutesInOven();
        ls.remainingMinutesInOven(minutes);
        ls.preparationTimeInMinutes(layers);
        ls.totalTimeInMinutes(layers, minutes);

    }
}
