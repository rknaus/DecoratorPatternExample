package ch.netgeek.DecoratorPatternExample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SpaghettiTest {

    Pasta spaghetti;
    
    @Before
    public void setUp() {
        spaghetti = new Spaghetti();
    }
    
    @Test
    public void testGetIngredient() {
        assertEquals("Spaghetti", spaghetti.getIngredient());
    }

    @Test
    public void testGetCalories() {
        assertTrue(300 == spaghetti.getCalories());
    }
    
    @Test
    public void testGetPrice() {
        assertTrue(7.5 == spaghetti.getPrice());
    }
}
