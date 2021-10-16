package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuGame {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.gameLoop();

        /*
        List<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("WPIS: ");
            String wpis = scanner.nextLine();
            while (lista.contains(wpis)) {
                System.out.print("JUZ TO WPISALES: ");
                wpis = scanner.nextLine();
            }
            lista.add(wpis);
        }

         */
    }
}
