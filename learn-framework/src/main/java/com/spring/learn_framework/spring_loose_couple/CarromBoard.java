package com.spring.learn_framework.spring_loose_couple;

import org.springframework.stereotype.Component;

@Component
public class CarromBoard implements GamingConsoleS{
    public void up() {
        System.out.println("CarromBoard hit up");
    }

    public void down() {
        System.out.println("CarromBoard hit down");
    }

    public void left() {
        System.out.println("CarromBoard move left");
    }

    public void right() {
        System.out.println("CarromBoard move right");
    }
}
