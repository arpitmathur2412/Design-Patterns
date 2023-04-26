package com.Behavioral_Design_Pattern.Observer_Pattern;


public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel("Gate Smashers");
        Channel channel2 = new Channel("Web Dev");

        Subscriber Subscriber1 = new Subscriber("Jane");
        Subscriber Subscriber2 = new Subscriber("Lisbon");
        Subscriber Subscriber3 = new Subscriber("Bixby");

        channel.registerObserver(Subscriber1);
        Subscriber1.subscribedChannels.add(channel);
        channel.registerObserver(Subscriber2);
        Subscriber2.subscribedChannels.add(channel);
        channel.registerObserver(Subscriber3);
        Subscriber3.subscribedChannels.add(channel);

        channel.uploadVideo("Creational");
        channel.uploadVideo("Structural");

        channel.removeObserver(Subscriber3);

        channel.uploadVideo("Revision");

        //sec channel
        System.out.println("");
        channel2.registerObserver(Subscriber1);
        Subscriber1.subscribedChannels.add(channel);
        channel2.registerObserver(Subscriber2);
        Subscriber2.subscribedChannels.add(channel);
        channel2.registerObserver(Subscriber3);
        Subscriber3.subscribedChannels.add(channel);

        channel2.uploadVideo("HTML");
        channel2.uploadVideo("CSS");

        channel2.removeObserver(Subscriber1);

        channel2.uploadVideo("JAVASCRIPT");

        System.out.println("");
        channel.uploadVideo("Test");
    }
}
