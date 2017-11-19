package templatePattern.src.game;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-19
 * Time: 17:34
 */
public class Cricket extends Game {
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
