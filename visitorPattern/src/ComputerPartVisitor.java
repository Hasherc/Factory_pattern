package visitorPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 17:40
 */
public interface ComputerPartVisitor {
     void visit(Computer computor);
     void visit(Keyboard keyboard);
     void visit(Mouse mouse);
     void visit(Monitor monitor);
}
