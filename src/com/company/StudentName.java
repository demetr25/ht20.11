package com.company;

import java.util.Random;

public enum StudentName {
    Alexandr,
    Dmitriy,
    Alexey,
    Nazar,
    Artem;

    public static StudentName getRandomStName() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
