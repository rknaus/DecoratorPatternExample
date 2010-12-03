package ch.netgeek.DecoratorPatternExample;

public class Pesto extends PastaDecorator {

    private String ingredient;
    private int calories;
    private double price;
    
    public Pesto(Pasta decoratedPasta) {
        super(decoratedPasta);

        ingredient = "Pesto";
        calories = 75;
        price = 3;
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
