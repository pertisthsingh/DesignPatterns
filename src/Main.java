import Patterns.ObserverDesign.YoutubeChannel;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        youtubeChannel.subscribeToChannel("Pertisth");
        youtubeChannel.subscribeToChannel("Tulasi");
        youtubeChannel.addVideo("GTA 6");

        youtubeChannel.unSubscribeToChannel("Pertisth");
        youtubeChannel.addVideo("PS 5");
    }
}