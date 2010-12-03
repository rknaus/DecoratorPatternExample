package ch.netgeek.DecoratorPatternExample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class NoodleTest {

    Pasta noodle;
    
    @Before
    public void setUp() {
        noodle = new Noodle();
    }
    
    @Test
    public void testGetIngredient() {
        assertEquals("Noodle", noodle.getIngredient());
    }

    @Test
    public void testGetCalories() {
        assertTrue(280 == noodle.getCalories());
    }
    
    @Test
    public void testGetPrice() {
    }

}
