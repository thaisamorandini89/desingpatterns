package adapter;

public class Aplicacao {

    public static void main(String args[]){
        PlugTresPinos p3 = new PlugTresPinos();

        AdapterTomada a = new AdapterTomada(p3);
        a.ligarDoisPinos(new Tomada());
    }

}
