package bridge;

public class APIDesenho1 implements APIDeDesenho{
    @Override
    public void desenharLinha(int x, int y) {
        System.out.println("Linha desenhada, do ponto x ao ponto y");
    }
}
