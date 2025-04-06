package com.spring.learn_framework.spring_loose_couple;

import com.spring.learn_framework.game_loose_couple.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerS {
    @Autowired
    private GamingConsoleS game;

    public GameRunnerS(GamingConsoleS game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
