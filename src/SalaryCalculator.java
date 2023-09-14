/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return multiplierPerProductsSold(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.00;
        double totalSalary = 0.0;
        double bonus = bonusForProductSold(productsSold);
        totalSalary = baseSalary + bonus > 2000.00 ? 2000.00 : baseSalary + bonus;
        return (daysSkipped > 5 && totalSalary > 2000.00) ? 2000.00 : ((daysSkipped > 5) ? (baseSalary * 0.85) + bonus : totalSalary);
    } 
    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();
        int daysSkipped = 3;
        int productSold = 21;
        double discount = sc.multiplierPerDaysSkipped(productSold);
        double bonus = sc.multiplierPerProductsSold(productSold);
        double total = sc.finalSalary(daysSkipped, productSold);
        
        System.out.println("Descuento por día: " + discount + "\nBonus: " + bonus + "\nTotal: " + total);
    }
}

