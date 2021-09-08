package com.kodilla.rps;

public interface MenuInterface {

    void askName();
    void sayHello(String name);
    void askRounds(String name);
    void instruction();
    void roundResult(String result);
    void askNewGame();
    void askExit();
    void wrongKey();
    void setMove(String name);
    void playerMove(String name, int move);
    void computerMove(int move);
    void playerResult(String name, int result);
    void computerResult(int result);
    void whoIsTheWinner(String statisticsResult);
    void wrongEndKey(String name);

}