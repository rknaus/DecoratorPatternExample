package ch.netgeek.DecoratorPatternExample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheeseTest {

    PastaDecorator decorator;
    
    @Before
    public void setUp() {
        decorator = new Cheese(new Spaghetti());
    }

    @Test
    public void testGetIngredient() {
        assertEquals("Spaghetti, Cheese", decorator.getIngredient());
    }

    @Test
    public void testGetCalories() {
        assertTrue(350 == decorator.getCalories());
    }

    @Test
    public void testGetPrice() {
        assertTrue(8.0 == decorator.getPrice());
    }

}
