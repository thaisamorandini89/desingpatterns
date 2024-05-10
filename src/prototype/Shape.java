package prototype;

public abstract class Shape implements Prototype{

    private String type;

    public Shape(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Prototype clone() {
        return null;
    }
}
