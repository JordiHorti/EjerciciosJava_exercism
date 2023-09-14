/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return birdsPerDay;      
    }

    public int getToday() {
        int visits = 0;
        for(int i= 0; i < birdsPerDay.length; i++){
            if(i == birdsPerDay.length -1){
                visits = birdsPerDay[i];
            }
        }
        return visits;
    }

    public void incrementTodaysCount() {
        for(int i= 0; i < birdsPerDay.length; i++){
            if(i == birdsPerDay.length -1){
                birdsPerDay[i] += 1;
            }
        }  
    }

    public boolean hasDayWithoutBirds() {
        boolean visit = false;
        
         for(int i= 0; i < birdsPerDay.length; i++){
             if(birdsPerDay[i] == 0){
                 visit = true;
             }
         }
         return visit;    
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i= 0; i < birdsPerDay.length; i++){
            if(i < numberOfDays)
                count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int bird : birdsPerDay){
            if(bird >= 5)
                count++;
        }
        return count; 
    }
    public static void main(String[] args) {
        int[] birdsPerDay = {2,5,0,7,4,1};
        
        BirdWatcher bw = new BirdWatcher(birdsPerDay);
        
        int[] lastWeek = bw.getLastWeek();
        
        int today = bw.getToday();
        
        boolean withoutBirds = bw.hasDayWithoutBirds();
        
        int firstDay = bw.getCountForFirstDays(6);
        
        int busy = bw.getBusyDays();
        
        System.out.print("lastWeek: ");
        for (int i = 0; i < lastWeek.length; i++) {
            System.out.print(lastWeek[i]);
            if (i < lastWeek.length - 1) {
            System.out.print(", ");
        }
    }
        System.out.println("\n" + today + "\n" + withoutBirds + "\n" + firstDay + "\n" + busy);
    }
}
