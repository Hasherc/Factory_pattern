package prototypePattern.src.shape;

import prototypePattern.src.Shape;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 15:55
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    protected void draw() {
        System.out.println("Rectangle.draw()");
    }
}

