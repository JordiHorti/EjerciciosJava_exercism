/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */

class Scrabble {
    private final int point; 

    Scrabble(String word) {
        int point = 0;
        
        for(int i = 0; i < word.length(); i++){
            word = word.toUpperCase();
            char newChar = word.charAt(i);
            
            switch(newChar){
                case 'A','E','I','O','U','L','N','R','S','T':
                    point += 1;
                    break;
                case 'D','G':
                    point += 2;
                    break;
                case 'B', 'C', 'M', 'P':
                    point += 3;
                    break;
                case 'F','H','V','W','Y':
                    point += 4;
                    break;
                case 'K':
                    point += 5;
                    break;
                case 'J','X':
                    point += 8;
                    break;
                case 'Q', 'Z':
                    point += 10;
                    break;               
            }
        }
        this.point = point; 
    }

    int getScore() {
      return point;    
    }
    public static void main(String[] args) {
        String word = "Hola";
        Scrabble sc = new Scrabble(word);
        
        int result = sc.getScore();
        
        System.out.println("Result: " + result);
        
    }
}

