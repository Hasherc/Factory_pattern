package abstractFactoryPattern.src.color;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-13
 * Time: 20:27
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue.fill()");
    }
}
