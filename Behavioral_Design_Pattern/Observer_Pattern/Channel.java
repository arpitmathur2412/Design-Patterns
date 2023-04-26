package com.Behavioral_Design_Pattern.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> observers;
    private String channelName;
    private List<String> videos;

    public Channel(String channelName) {
        this.channelName = channelName;
        this.observers = new ArrayList<>();
        this.videos = new ArrayList<>();
    }

    public void uploadVideo(String videoName) {
        this.videos.add(videoName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(channelName, videos.get(videos.size() - 1));
        }
    }
}