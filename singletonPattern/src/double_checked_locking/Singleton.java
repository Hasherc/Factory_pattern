package singletonPattern.src.double_checked_locking;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-14
 * Time: 23:56
 */

/**
 * Lazy初始化: Yes
 * 线程安全: Yes
 * 实现难度: hard
 * description：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。getInstance() 的性能对应用程序很关键。
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){}

    public static Singleton getSingleton() {
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
