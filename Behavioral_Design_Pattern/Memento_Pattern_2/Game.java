package com.Behavioral_Design_Pattern.Memento_Pattern_2;

public class Game {
    public static void main(String[] args) {
        Player player = new Player(100, 1);
        PlayerHistory history = new PlayerHistory();

        System.out.println(player);

        player.setLevel(2);
        history.save(player.save());
        System.out.println(player);

        player.setHealth(80);
        history.save(player.save());
        System.out.println(player);

        player.setLevel(3);
        history.save(player.save());
        System.out.println(player);

        player.restore(history.undo());
        System.out.println(player);

        player.restore(history.undo());
        System.out.println(player);

        player.restore(history.undo());
        System.out.println(player);
    }
}