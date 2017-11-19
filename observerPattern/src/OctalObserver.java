package observerPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 16:41
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
