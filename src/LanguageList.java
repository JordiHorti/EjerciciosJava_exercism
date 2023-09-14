/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        boolean exist = false;
        for(String language : languages){
            if(containsLanguage("Java") || containsLanguage("Kotlin")){
                exist = true;
            }
        }
        return exist;
    }
    public static void main(String[] args) {
        
        LanguageList lg = new LanguageList();
        
        String language = "Java";
        
        boolean empty = lg.isEmpty();
        
        lg.addLanguage(language);
        
        String firstLanguage = lg. firstLanguage();
        
        int count = lg.count();
        
        boolean contains = lg.containsLanguage(language);
        
        boolean exist = lg.isExciting();
        
        System.out.println(empty +"\n" + firstLanguage +"\n" + count + "\n" + contains + "\n" + exist);
    }
}
