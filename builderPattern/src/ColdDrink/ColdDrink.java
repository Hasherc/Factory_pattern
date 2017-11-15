package builderPattern.src.ColdDrink;

import builderPattern.src.Bottle;
import builderPattern.src.Item;
import builderPattern.src.Packing;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 0:22
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
