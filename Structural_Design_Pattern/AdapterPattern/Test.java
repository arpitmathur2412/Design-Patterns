package com.Structural_Design_Pattern.AdapterPattern;

public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "I ain't worried.mp3");
        audioPlayer.play("mp4", "what's up danger.mp4");
        audioPlayer.play("vlc", "whatever it takes.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
