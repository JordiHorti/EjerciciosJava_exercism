/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class SqueakyClean {
  
   static String clean(String identifier) {
         StringBuilder sb = new StringBuilder(identifier);
    StringBuilder cleaned = new StringBuilder();

    boolean control = false;
    boolean control1 = false;

    for (int i = 0; i < sb.length(); i++) {
        char letter = sb.charAt(i);

        if (letter == ' ') {
            cleaned.append('_');
        } else if (Character.isISOControl(letter) && !control) {
            cleaned.append("CTRL");
            control = true;
        } else if (letter == '-' && !control1) {
            cleaned.append("CTRL");
            control1 = true;
        } else if (!Character.isLetter(letter)) {
            cleaned.deleteCharAt(i);
            
        } else if (letter >= 'α' && letter <= 'ω') {
            // Omitir letras griegas
        } else {
            cleaned.append(letter);
            control = false;
            control1 = false;
        }
    }

    return cleaned.toString();
       
    }

    public static void main (String[] args) {
        String cleaned = SqueakyClean.clean("a1😀2😀3😀b");
        System.out.println(cleaned);
    }
} 

