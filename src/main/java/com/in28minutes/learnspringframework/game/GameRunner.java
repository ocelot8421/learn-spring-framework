package com.in28minutes.learnspringframework.game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired  // -- Field Dependency Injection: injection happens through reflection
    private GamingConsole game;

// -- Constructor-based Dependency Injection: Autowired by Constructor - RECOMMENDED
    public GameRunner(GamingConsole game) {
        System.out.println("Using Constructor");
        this.game = game;
    }


//    @Autowired // -- Setter-based Dependency Injection: Autowired by Setter
//    public void setGame(GamingConsole game) {
//        System.out.println("Using Setter");
//        this.game = game;
//    }

    public void runGame(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
