package adapter;

public class AdapterTomada extends PlugDoisPinos{
    private PlugTresPinos plugTresPinos;

    public AdapterTomada(PlugTresPinos plugTresPinos) {
        this.plugTresPinos = plugTresPinos;
    }

    public void ligarDoisPinos(Tomada t){
        plugTresPinos.ligarTresPinos(t);
    }
}
