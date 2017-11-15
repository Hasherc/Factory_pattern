package abstractFactoryPattern.src.shape;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-13
 * Time: 20:10
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
}
