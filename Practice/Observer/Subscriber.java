package com.Practice.Observer;

import java.util.*;
public class Subscriber implements Observer {

    private List<Channel> channel;

    public void update(String channelname,String videoname){
        System.out.println("new video uploaded by"+channelname+"of "+videoname);
    }
}
