/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class Warriors {
    
   abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
       return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
       return wizard.isVulnerable() == true ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean preparation = false; 

    @Override
    public String toString() {
       return "Fighter is a Wizard";
    }
    @Override
    boolean isVulnerable() {
        return preparation == false ? true : false; 
    }

    @Override
    int damagePoints(Fighter warrior) {
        return preparation == false ? 3 : 12;    
    }

    void prepareSpell() {
        preparation = true;
    }

}
 
}
