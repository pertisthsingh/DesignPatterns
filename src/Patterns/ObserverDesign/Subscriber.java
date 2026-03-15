package Patterns.ObserverDesign;

public class Subscriber implements IObserver {
    private String name;

    Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void updateNewVideoTitle(String channelNameString, String videoName) {
        System.out.println(name + " got this notification " +channelNameString + " added this video " + videoName);
    }
}
