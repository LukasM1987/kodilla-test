package com.kodilla.sudoku;

public class Menu implements MenuInterface {

    @Override
    public void addFile() {
        System.out.print("Please enter a file name (with .txt): ");
    }

    @Override
    public void welcome() {
    System.out.println("Welcome to the sudoku game!");
}

    @Override
    public void addElement() {
        System.out.print("Enter number from 1 to 9, or enter SUDOKU or FINISH: ");
    }

    @Override
    public void addXNumberPosition() {
        System.out.print("Enter X number Position: ");
    }

    @Override
    public void addYNumberPosition() {
        System.out.print("Enter Y number Position: ");
    }

    @Override
    public void unrecognizedElement() {
        System.out.print("Wrong number or reference! Please enter number from 1 to 9, SUDOKU or FINISH: ");
    }

    @Override
    public void unrecognizedNumber() {
        System.out.println("Wrong number X or Y position! Please enter number form 1 to 9!");
    }

    @Override
    public void congratulations() {
        System.out.println("Congratulations! You have solved sudoku on your own!");
    }

    @Override
    public void failure() {
        System.out.println("Unfortunately you didn't solve sudoku yourself.");
    }

    @Override
    public void mistake() {
        System.out.println("Oops, you made a mistake somewhere, or not all fields are complete.");
    }

    @Override
    public void unsolvable() {
        System.out.println("Unfortunately, this system of numbers cannot be solved.");
    }
}
