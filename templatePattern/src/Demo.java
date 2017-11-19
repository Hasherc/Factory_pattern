package templatePattern.src;

import templatePattern.src.game.Cricket;
import templatePattern.src.game.Football;
import templatePattern.src.game.Game;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 17:35
 */
public class Demo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
