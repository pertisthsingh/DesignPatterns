package Patterns.AdapterDesign;

public class MusicPlayerAdapter implements MusicPlayer{

    AdvancedPlayer advPlayer = new AdvancedPlayer();

    @Override
    public void play(String musicType) {
        if(musicType.equalsIgnoreCase("mp4")) {
            advPlayer.playMp4();
        }
    }
}
