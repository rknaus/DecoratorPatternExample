package ch.netgeek.DecoratorPatternExample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PestoTest {

PastaDecorator decorator;
    
    @Before
    public void setUp() {
        decorator = new Pesto(new Spaghetti());
    }

    @Test
    public void testGetIngredient() {
        assertEquals("Spaghetti, Pesto", decorator.getIngredient());
    }

    @Test
    public void testGetCalories() {
        assertTrue(375 == decorator.getCalories());
    }

    @Test
    public void testGetPrice() {
        assertTrue(10.5 == decorator.getPrice());
    }

}
