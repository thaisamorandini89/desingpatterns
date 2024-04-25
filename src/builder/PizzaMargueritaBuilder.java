package builder;

public class PizzaMargueritaBuilder extends  PizzaBuilder{
    @Override
    public void buildTempero() {
        pizza.setTempero("quente");
    }

    @Override
    public void buildCobertura() {
        pizza.setCobertura("tomate");
    }
}
