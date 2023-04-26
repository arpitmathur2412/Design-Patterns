package com.Behavioral_Design_Pattern.Observer_Pattern;


import java.util.ArrayList;

public class Subscriber implements Observer {
    private String userName;
    public ArrayList<Channel> subscribedChannels = new ArrayList<Channel>();
    public Subscriber(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String channelName, String videoName) {
        System.out.println(userName + ", you have a new video from " + channelName + ": " + videoName);
    }
}
