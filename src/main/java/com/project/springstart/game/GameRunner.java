package com.project.springstart.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    private GamingConsole game;
    private MarioGame marioGame;
    private SuperContraGame superContraGame;

//    public GameRunner(SuperContraGame superContraGame) {
//        this.superContraGame = superContraGame;
//    }
    public GameRunner(GamingConsole gamingConsole) {
        this.game = gamingConsole;
    }
    public void run()
    {
      game.up();
      game.right();
      game.left();
      game.down();
    }
    public void setSuperContraGameRun()
    {
        superContraGame.up();
        superContraGame.right();
        superContraGame.left();
        superContraGame.down();
    }
}
