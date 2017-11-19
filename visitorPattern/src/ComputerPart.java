package visitorPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 17:40
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
