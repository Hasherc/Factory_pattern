package prototypePattern.src.shape;

import prototypePattern.src.Shape;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 16:00
 */
public class Square extends Shape {
    @Override
    protected void draw() {
        System.out.println("Square.draw()");
    }

    public Square(){
        type = "Square";
    }
}
