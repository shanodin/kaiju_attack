package com.example.alice.kaiju_attack;

/**
 * Created by alice on 06/09/2017.
 */

public abstract class Kaiju
        implements Damageable  {
    public String name;
    public int healthVal;
    public int attackVal;

    public Kaiju(String name, int healthVal, int attackVal){
        this.name = name;
        this.healthVal = healthVal;
        this.attackVal = attackVal;
    }

    public String getName(){
        return this.name;
    }

    public int getAttackVal(){
        return this.attackVal;
    }

    public int getHealthVal(){
        return this.healthVal;
    }

    public void damage(int damageTaken){
        this.healthVal -= damageTaken;
    }

}


