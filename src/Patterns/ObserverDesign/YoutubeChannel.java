package Patterns.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<IObserver> subscribers = new ArrayList<>();
    public String name = "Gaming Channel";

    public void subscribeToChannel(String name) {
        IObserver subscriber = new Subscriber(name);
        subscribers.add(subscriber);
    }

    public void unSubscribeToChannel(String name) {
        subscribers.removeIf((observer) -> ((Subscriber)observer).getName().equals(name));
    }

    public void addVideo(String videoName) {
        for(IObserver subscribers : subscribers) {
            subscribers.updateNewVideoTitle(this.name,videoName);
        }
    }
}
