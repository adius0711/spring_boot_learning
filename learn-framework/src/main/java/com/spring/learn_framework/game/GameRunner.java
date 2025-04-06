package com.spring.learn_framework.game;

public class GameRunner {
    private MarioGame game;

    private SuperContra superContra;
    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public GameRunner(SuperContra superContra) {
        this.superContra = superContra;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }

    public void runSuperContra() {
        superContra.up();
        superContra.down();
        superContra.left();
        superContra.right();
    }
}
