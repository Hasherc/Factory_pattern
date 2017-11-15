package builderPattern.src.Burger;

import builderPattern.src.Item;
import builderPattern.src.Packing;
import builderPattern.src.Wrapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 0:20
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
