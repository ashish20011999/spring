package com.project.springstart.game;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {
    //implementing an interface will lead to a generic way of using multiple classes
    //without code changes to GameRunner class
    void up();
    void down();
    void left();
    void right();
}
