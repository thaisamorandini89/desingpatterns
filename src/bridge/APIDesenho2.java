package bridge;

public class APIDesenho2 implements APIDeDesenho{
    @Override
    public void desenharLinha(int x, int y) {
        System.out.println("Linha desenhada, do ponto x ao ponto y "+
                " mas um pouco diferente");
    }
}
