package com.project.springstart.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class SuperContraGame implements GamingConsole {
    public void up()
    {
        System.out.println("SuperContra jump");
    }
    public void down()
    {
        System.out.println("SuperContra down into a hole");
    }
    public void left()
    {
        System.out.println("SuperContra stop");
    }
    public void right()
    {
        System.out.println("SuperContra accelerate");
    }
}
