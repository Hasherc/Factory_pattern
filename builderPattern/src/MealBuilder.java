package builderPattern.src;

import builderPattern.src.Burger.ChickenBurger;
import builderPattern.src.Burger.VegBurger;
import builderPattern.src.ColdDrink.Coke;
import builderPattern.src.ColdDrink.Pepsi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 0:33
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVefMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
