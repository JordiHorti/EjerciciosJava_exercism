/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class Hamming {
  
    private String leftStrand;
    private String rightStrand;
    
    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.isEmpty() && rightStrand.isEmpty()){
            return;
        }else if (rightStrand.isEmpty()){
                throw new IllegalArgumentException("right strand must not be empty.");
        }else if(leftStrand.isEmpty() ){
            throw new IllegalArgumentException("left strand must not be empty.");
        }else if(leftStrand.length() != rightStrand.length()){
             throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        int distance = 0;
        if(leftStrand == null && rightStrand == null) {
            return distance;
        }
        if(leftStrand.length() == rightStrand.length() ){
            for(int i = 0; i < leftStrand.length(); i++){
                if(leftStrand.charAt(i) != (rightStrand.charAt(i))){
                    distance++;
                }  
            }
        }
        return distance; 
    }
    public static void main(String[] args) {
        String leftStrand = "GGACTGAAATCTG";
        String rightStrand = "GGACTGAAATCTG";
        Hamming hm = new Hamming(leftStrand,rightStrand);
        int distance = hm.getHammingDistance();
        System.out.println("Distance: " +  distance);
    }
}
 

