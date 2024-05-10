package adapter;

public class Tomada {
    private boolean conectada;
    private String dispositivoConectado;

    public Tomada(){
        this.conectada = false;
        this.dispositivoConectado = null;
    }

    public void conectar(String dispositivo) {
        if (!conectada) {
            this.dispositivoConectado = dispositivo;
            this.conectada = true;
            System.out.println("O dispositivo '" + dispositivo + "' foi conectado à tomada.");
        } else {
            System.out.println("A tomada já está ocupada por outro dispositivo.");
        }
    }

    public void desconectar() {
        if (conectada) {
            System.out.println("O dispositivo '" + dispositivoConectado + "' foi desconectado da tomada.");
            this.dispositivoConectado = null;
            this.conectada = false;
        } else {
            System.out.println("Não há dispositivo conectado para desconectar.");
        }
    }

    public boolean isConectada() {
        return conectada;
    }

    public String getDispositivoConectado() {
        return dispositivoConectado;
    }
}
