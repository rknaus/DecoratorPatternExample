package ch.netgeek.DecoratorPatternExample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CombinedPastaDecoratorTest {

    @Test
    public void testPestoCheeseSpaghetti() {
        
        Pasta spaghetti = new Spaghetti();
        
        PastaDecorator pestoCheeseSpaghetti = new Pesto(new Cheese(spaghetti));
        assertEquals("Spaghetti, Cheese, Pesto", pestoCheeseSpaghetti.getIngredient());
        assertTrue(425 == pestoCheeseSpaghetti.getCalories());
        assertTrue(11.0 == pestoCheeseSpaghetti.getPrice());
    }
    
    @Test
    public void testCheeseTomatoSauceNoodle() {
        
        Pasta noodle = new Noodle();
        
        PastaDecorator cheeseTomatoSauceNoodle = new Cheese(new TomatoSauce(noodle));
        assertEquals("Noodle, Tomato Sauce, Cheese", cheeseTomatoSauceNoodle.getIngredient());
        assertTrue(340 == cheeseTomatoSauceNoodle.getCalories());
        assertTrue(11.0 == cheeseTomatoSauceNoodle.getPrice());
    }
    
    @Test
    public void testCheesePestoTomatoSauceSpaghetti() {
        
        Pasta spaghetti = new Spaghetti();
        
        PastaDecorator cheesePestoTomatoSauceSpaghetti = new Cheese(new Pesto(new TomatoSauce(spaghetti)));
        assertEquals("Spaghetti, Tomato Sauce, Pesto, Cheese", cheesePestoTomatoSauceSpaghetti.getIngredient());
        assertTrue(435 == cheesePestoTomatoSauceSpaghetti.getCalories());
        assertTrue(13.0 == cheesePestoTomatoSauceSpaghetti.getPrice());
    }
}
