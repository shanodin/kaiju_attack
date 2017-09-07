package com.example.alice.kaiju_attack;

/**
 * Created by alice on 06/09/2017.
 */

public class Freiza extends Kaiju {
    public Freiza(String name, int healthVal, int attackVal) {
        super(name, healthVal, attackVal);
    }

    public String roar(){
        return("I will defeat you, Kakarot!");
    }
}
