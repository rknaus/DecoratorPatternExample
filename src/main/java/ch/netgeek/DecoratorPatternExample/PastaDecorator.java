package ch.netgeek.DecoratorPatternExample;

public abstract class PastaDecorator implements Pasta {

    private Pasta decoratedPasta;
    String ingredientSeparator;
    
    public PastaDecorator(Pasta decoratedPasta) {
        this.decoratedPasta = decoratedPasta;
        ingredientSeparator = ", ";
    }
    

    @Override
    public String getIngredient() {
        return decoratedPasta.getIngredient();
    }
    
    @Override
    public int getCalories() {
        return decoratedPasta.getCalories();
    }

    @Override
    public double getPrice() {
        return decoratedPasta.getPrice();
    }

}
