package singletonPattern.src.hungry_syn;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-14
 * Time: 23:51
 */

/**
 * Lazy初始化: No
 * 线程安全: Yes
 * 实现难度: easy
 * description：这种方式比较常用，但容易产生垃圾对象。
 *              优点：没有加锁，执行效率会提高。
 *              缺点：类加载时就初始化，浪费内存。它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，
 *              虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
 *              但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}
