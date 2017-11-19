package observerPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 16:36
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
