package protoype.withCloneable;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public void registerShape(String key, Shape shape){
        shapeMap.put(key, shape);
    }

    public Shape getClone(String key){
        return shapeMap.get(key).clone();
    }
}
