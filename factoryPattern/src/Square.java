package factoryPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-13
 * Time: 20:09
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}