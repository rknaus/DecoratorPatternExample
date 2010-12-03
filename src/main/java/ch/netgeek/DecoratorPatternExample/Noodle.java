package ch.netgeek.DecoratorPatternExample;

public class Noodle implements Pasta {

    private String ingredient;
    private int calories;
    private double price;
    
    public Noodle() {
        ingredient = "Noodle";
        calories = 280;
        price = 8.5;
    }
    
    @Override
    public String getIngredient() {
        return ingredient;
    }
    
    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
