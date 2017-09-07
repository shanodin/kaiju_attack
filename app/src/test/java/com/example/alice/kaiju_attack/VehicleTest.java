package com.example.alice.kaiju_attack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by alice on 06/09/2017.
 */

public class VehicleTest {

    Xwing xwing;
    Brigantine brigantine;
    Freiza freiza;

    @Before
    public void before(){
        xwing = new Xwing("Spaceship", 100, 100);
        brigantine = new Brigantine("Boat", 50, 25);
        freiza = new Freiza("Freiza", 1000, 75 );
    }

    @Test
    public void testVehicleType(){
        assertEquals("Spaceship", xwing.getType());
        assertEquals("Boat", brigantine.getType());
    }

    @Test
    public void testVehicleAttack(){
        assertEquals(100, xwing.getAttackVal());
        assertEquals(25, brigantine.getAttackVal());
    }

    @Test
    public void testVehicleArmour(){
        assertEquals(100, xwing.getArmourVal());
        assertEquals(50, brigantine.getArmourVal());
    }

    @Test
    public void testAttackDoesDamage(){
        xwing.damage(freiza.getAttackVal());
        assertEquals(25, xwing.getArmourVal());
    }
}
