
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class BlackJack {

    public int parseCard(String card) {
        switch(card){
            case "ace":
                return 11;           
            case "two":
                return 2;             
            case "three":
                return 3;         
            case "four":
                return 4;
            case "five":
                return 5;
            case "sixt":
                return 6; 
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
                return 10;
            case "Jack","queen","king":
                return 10;
            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        if(((parseCard(card1) + parseCard(card2)) == 21))
            return true;
        return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        
        if(isBlackjack){
            if(dealerScore < 10){
                return "W";
            }else
                return "S";
    
        }else{
            return "P";
        }

    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore > 17)
            return "S";
        else if(handScore <= 11)
            return "H";
        if(handScore >= 12 && handScore <= 16){
            if(dealerScore >= 7){
                return "H";
            }else{
                return "S";
            }
        }
        return "";
    }

  
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
    public static void main(String[] args) {
        BlackJack bj = new BlackJack();
        
        int card1 = bj.parseCard("ace");
        int card2 = bj.parseCard("king");
        boolean isBlackJack = bj.isBlackjack("ace", "king");
        
        String large = bj.largeHand(bj.isBlackjack("ace","king"),card1);
        
        String small = bj.smallHand(card2, card2);
        
        String first = bj.firstTurn("ace", "king", "ace");
        
        System.out.println(card1 + "\n" + isBlackJack + "\n" + large + "\n" + small + "\n" + first);
    }
}

