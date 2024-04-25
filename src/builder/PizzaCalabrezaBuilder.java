package builder;

public class PizzaCalabrezaBuilder extends PizzaBuilder {

    @Override
    public void buildTempero() {
        pizza.setTempero("médio");
    }

    @Override
    public void buildCobertura() {
        pizza.setCobertura("calabreza");
    }
}
