package com.Structural_Design_Pattern.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
        @Override
        public void playVlc(String fileName) {
            System.out.println("Playing vlc file. Name: "+ fileName);
        }

        @Override
        public void playMp4(String fileName) {
            System.out.println("incompatible file type");
        }
    }