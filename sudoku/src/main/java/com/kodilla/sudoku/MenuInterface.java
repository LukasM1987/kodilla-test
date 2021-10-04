package com.kodilla.sudoku;

import java.time.LocalTime;

public interface MenuInterface {

    void welcome();
    void addElement();
    void addXNumberPosition();
    void addYNumberPosition();
    void unrecognizedElement();
    void unrecognizedNumber();
    void congratulations();
    void failure();
    void mistake();
    void start(LocalTime start);
    void end(LocalTime end);
}
