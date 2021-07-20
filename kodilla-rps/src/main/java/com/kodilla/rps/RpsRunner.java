package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.mainMenuName();
        menu.mainMenuRoudns();
        Game game = new Game();
        game.skirmish();
        game.skirmishResult();
        menu.endMenu();
    }
}
