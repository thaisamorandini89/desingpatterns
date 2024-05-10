package prototype;

public class Rectangle extends Shape{
    public Rectangle() {
        super("Rectangle");
    }

    @Override
    public Prototype clone() {
        return new Rectangle();
    }
}
