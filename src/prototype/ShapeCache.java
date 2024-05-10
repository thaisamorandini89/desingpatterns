package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map<String, Prototype> shapeMap = new HashMap<>();

    public static void loadCache() {
        shapeMap.put("Circle", new Circle());
        shapeMap.put("Rectangle", new Rectangle());
    }

    public static Prototype getShape(String type) {
        Prototype cachedShape = shapeMap.get(type);
        return cachedShape != null ? cachedShape.clone() : null;
    }
}

