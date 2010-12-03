package ch.netgeek.DecoratorPatternExample;

public class Spaghetti implements Pasta {

    private String ingredient;
    private int calories;
    private double price;
    
    public Spaghetti() {
        ingredient = "Spaghetti";
        calories = 300;
        price = 7.5;
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
