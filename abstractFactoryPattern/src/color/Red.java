package abstractFactoryPattern.src.color;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-13
 * Time: 20:26
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red.fill()");
    }
}
