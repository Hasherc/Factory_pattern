package prototypePattern.src.shape;

import prototypePattern.src.Shape;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 16:01
 */
public class Circle extends Shape {
    @Override
    protected void draw() {
        System.out.println("Circle.draw()");
    }

    public Circle() {
        type = "Circle";
    }
}
