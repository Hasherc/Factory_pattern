package abstractFactoryPattern.src.color;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-13
 * Time: 20:26
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green.fill()");
    }
}
