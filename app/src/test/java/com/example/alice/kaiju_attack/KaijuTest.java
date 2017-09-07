package com.example.alice.kaiju_attack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by alice on 06/09/2017.
 */

public class KaijuTest {

    Titan titan;
    Freiza freiza;

    @Before
    public void before(){
        titan = new Titan("Mothra", 500, 50);
        freiza = new Freiza("Freiza", 1000, 100 );
    }

    @Test
    public void testKaijuNames(){
        assertEquals("Mothra", titan.getName());
        assertEquals("Freiza", freiza.getName());
    }

    @Test
    public void testKaijuAttackVal(){
        assertEquals(50, titan.getAttackVal());
        assertEquals(100, freiza.getAttackVal());
    }

    @Test
    public void testKaijuHealthVal(){
        assertEquals(500, titan.getHealthVal());
        assertEquals(1000, freiza.getHealthVal());
    }

    @Test
    public void testKaijuRoar(){
        assertEquals("moth roar", titan.roar());
        assertEquals("I will defeat you, Kakarot!", freiza.roar());
    }

}
