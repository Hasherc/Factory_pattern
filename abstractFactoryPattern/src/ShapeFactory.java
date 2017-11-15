package abstractFactoryPattern.src;

import abstractFactoryPattern.src.color.Color;
import abstractFactoryPattern.src.shape.Circle;
import abstractFactoryPattern.src.shape.Rectangle;
import abstractFactoryPattern.src.shape.Shape;
import abstractFactoryPattern.src.shape.Square;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-13
 * Time: 20:29
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null){
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("BLUE")){
            return new Square();
        }
        return null;
    }
}
