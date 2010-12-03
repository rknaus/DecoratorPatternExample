package ch.netgeek.DecoratorPatternExample;

public class Cheese extends PastaDecorator {

    private String ingredient;
    private int calories;
    private double price;
    
    public Cheese(Pasta decoratedPasta) {
        super(decoratedPasta);
        
        ingredient = "Cheese";
        calories = 50;
        price = 0.5;
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + super.ingredientSeparator + ingredient;
    }
    
    @Override
    public int getCalories() {
        return super.getCalories() + calories;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

}
