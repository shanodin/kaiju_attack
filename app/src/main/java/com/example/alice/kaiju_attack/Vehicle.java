package com.example.alice.kaiju_attack;

/**
 * Created by alice on 06/09/2017.
 */

public abstract class Vehicle
        implements Damageable {

    public String type;
    public int armourVal;
    public int attackVal;

    public Vehicle(String type, int armourVal, int attackVal){
        this.type = type;
        this.armourVal = armourVal;
        this.attackVal = attackVal;
    }

    public String getType(){
        return this.type;
    }

    public int getAttackVal(){
        return this.attackVal;
    }

    public int getArmourVal(){
        return this.armourVal;
    }

    public void damage(int damageTaken){
        this.armourVal -= damageTaken;
    }
}
