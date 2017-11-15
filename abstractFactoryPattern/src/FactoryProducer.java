package abstractFactoryPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-14
 * Time: 23:23
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice == null){
            return null;
        }
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
