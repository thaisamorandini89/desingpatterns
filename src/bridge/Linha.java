package bridge;

public class Linha implements Forma{
    private APIDeDesenho api;
    private int x;
    private int y;
    public Linha(int x, int y, APIDeDesenho api){
        this.x = x; this.y = y;
        this.api = api;
    }
    @Override
    public void desenharLinha() {
        api.desenharLinha(x, y);
    }
}
