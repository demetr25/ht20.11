package com.company;

import java.util.Random;

public enum CarColors {
    RED,
    BLUE,
    YELLOW,
    BLACK;

    public static CarColors getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
