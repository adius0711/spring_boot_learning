package com.spring.learn_framework.game_loose_couple;

public class GameRunnerL {
    private GamingConsole game;

    public GameRunnerL(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
