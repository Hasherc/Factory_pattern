package singletonPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-14
 * Time: 23:38
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
