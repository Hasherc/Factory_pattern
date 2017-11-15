package prototypePattern.src;

import prototypePattern.src.shape.Circle;
import prototypePattern.src.shape.Rectangle;
import prototypePattern.src.shape.Square;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 16:02
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(square.getId(), rectangle);
    }
}
