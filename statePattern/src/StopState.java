package statePattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 17:05
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
