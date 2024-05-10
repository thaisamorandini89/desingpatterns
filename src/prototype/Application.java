package prototype;

public class Application {
    public static void main(String[] args){
        ShapeCache.loadCache(); // Carrega os protótipos no cache

        // Obtém clones dos protótipos
        Prototype clonedCircle = ShapeCache.getShape("Circle");
        Prototype clonedRectangle = ShapeCache.getShape("Rectangle");

        // Exemplo de uso dos clones
        System.out.println("Cloned Shape: " + clonedCircle);
        System.out.println("Cloned Shape: " + clonedRectangle);
    }
}
