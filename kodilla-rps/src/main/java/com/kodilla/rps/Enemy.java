package com.kodilla.rps;

import java.util.Random;

public class Enemy {

    private static final Random random = new Random();

    public int enemyMove() {
        int enemyMove = random.nextInt(3) + 1;
        return enemyMove;
    }
}
