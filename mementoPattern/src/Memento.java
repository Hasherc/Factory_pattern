package mementoPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 16:15
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {

        this.state = state;
    }
}
