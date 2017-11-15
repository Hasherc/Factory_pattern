package prototypePattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 16:15
 */
public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape = ShapeCache.getShape("1");
        Shape cloneShape2 = ShapeCache.getShape("2");
        Shape cloneShape3 = ShapeCache.getShape("3");
    }
}
