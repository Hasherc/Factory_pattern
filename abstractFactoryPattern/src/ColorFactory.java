package abstractFactoryPattern.src;

import abstractFactoryPattern.src.color.Blue;
import abstractFactoryPattern.src.color.Color;
import abstractFactoryPattern.src.color.Green;
import abstractFactoryPattern.src.color.Red;
import abstractFactoryPattern.src.shape.Shape;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-13
 * Time: 20:34
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null){
            return null;
        }
        if (color.equalsIgnoreCase("RED")){
            return new Red();
        }else if (color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if (color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
