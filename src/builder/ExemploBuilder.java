package builder;

public class ExemploBuilder {
    public static void main(String[] args){
        Cozinhar c = new Cozinhar();

        PizzaBuilder pizzaBuilderMarguerita = new PizzaMargueritaBuilder();
        PizzaBuilder pizzaBuilderCalabreza = new PizzaCalabrezaBuilder();

        c.setPizzaBuilder(pizzaBuilderMarguerita);

        c.constructPizza();

        Pizza marguerita = c.getPizza();

        System.out.println("Tempero da primeira pizza escolhida é: "+marguerita.getTempero());
        System.out.println("Cobertura da primeira pizza escolhida é: "+marguerita.getCobertura());

        c.setPizzaBuilder(pizzaBuilderCalabreza);

        c.constructPizza();

        Pizza calabreza = c.getPizza();

        System.out.println("Tempero da segunda pizza escolhida é: "+calabreza.getTempero());
        System.out.println("Cobertura da segunda pizza escolhida é: "+calabreza.getCobertura());
    }


}
