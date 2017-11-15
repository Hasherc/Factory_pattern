package adapterPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 19:53
 */
public class demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4","独立日");
        audioPlayer.play("mp3", "你好");
        audioPlayer.play("vlc","dasd.vlc");
        audioPlayer.play("exe","xxxx");
    }
}
