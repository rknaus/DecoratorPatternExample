package ch.netgeek.DecoratorPatternExample;

public class TomatoSauce extends PastaDecorator {

    private String ingredient;
    private int calories;
    private double price;
    
    public TomatoSauce(Pasta decoratedPasta) {
        super(decoratedPasta);

        ingredient = "Tomato Sauce";
        calories = 10;
        price = 2;
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
