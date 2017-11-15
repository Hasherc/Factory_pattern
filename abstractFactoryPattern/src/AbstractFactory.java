package abstractFactoryPattern.src;

import abstractFactoryPattern.src.color.Color;
import abstractFactoryPattern.src.shape.Shape;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-13
 * Time: 20:28
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
