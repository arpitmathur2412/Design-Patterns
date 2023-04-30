package com.Practice.Observer;
import java.util.*;
public class Channel implements Subject{
    private List<Observer> observerList;

    private List<String> videolist;
    String channelName;

    public Channel(String channelname){
        observerList=new ArrayList<Observer>();
        videolist=new ArrayList<String>();
        this.channelName=channelname;
    }



    public void addVideo(String videoname){
        videolist.add(videoname);
        notifyObservers();
    }
    @Override
    public void addUser(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeUser(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer :observerList){
            observer.update(this.channelName,videolist.get(videolist.size()-1));
        }
    }
}
