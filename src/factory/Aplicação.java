package factory;

public class Aplicação {
    public static void main(String args[]){
        FactoryPessoa factory = new FactoryPessoa();

        String nome = "Thaísa Honório Morandini";
        String sexo = "F";

        factory.getPessoa(nome,sexo);
    }
}
