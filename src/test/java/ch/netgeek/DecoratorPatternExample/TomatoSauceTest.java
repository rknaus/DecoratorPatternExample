package ch.netgeek.DecoratorPatternExample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class TomatoSauceTest {

PastaDecorator decorator;
    
    @Before
    public void setUp() {
        decorator = new TomatoSauce(new Spaghetti());
    }

    @Test
    public void testGetIngredient() {
        assertEquals("Spaghetti, Tomato Sauce", decorator.getIngredient());
    }

    @Test
    public void testGetCalories() {
        assertTrue(310 == decorator.getCalories());
    }

    @Test
    public void testGetPrice() {
        assertTrue(9.5 == decorator.getPrice());
    }
    
}
