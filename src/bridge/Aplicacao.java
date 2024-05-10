package bridge;

import prototype.Shape;

public class Aplicacao {
    public static void main(String args[]){
        Forma[] formas = (Forma[]) new Shape[2];
        formas[0] = new Linha(1,2, new APIDesenho1());
        formas[1] = new Linha(5, 7, new APIDesenho2());

        for (Forma forma: formas){
            forma.desenharLinha();
        }
    }
}
