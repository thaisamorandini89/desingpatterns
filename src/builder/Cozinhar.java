package builder;

public class Cozinhar {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void constructPizza(){
        pizzaBuilder.criarNovoProdutoPizza();
        pizzaBuilder.buildTempero();
        pizzaBuilder.buildCobertura();
    }
}
