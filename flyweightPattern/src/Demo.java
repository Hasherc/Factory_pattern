package flyweightPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-16
 * Time: 16:23
 */
public class Demo {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }
    private static String getRandomColor(){
        return colors[(int) (Math.random()*colors.length)];
    }
    private static int getRandomY(){
        return (int) (Math.random()*100);
    }
    private static int getRandomX(){
        return (int) (Math.random()*100);
    }
}
