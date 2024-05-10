package prototype;

public class Circle extends Shape{
    public Circle() {
        super("Circle");
    }

    @Override
    public Circle clone() {
        return new Circle();
    }
}
