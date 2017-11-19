package MediatorPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 16:08
 */
public class Demo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User job = new User("Job");
        robert.sendMessage("hahah");
        job.sendMessage("hello");
    }
}
