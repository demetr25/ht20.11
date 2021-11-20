package com.company;

import java.util.Random;

public enum StudentPatronym {
    Alexandrovich,
    Borisovich,
    Pavlovich,
    Sergeevich,
    Vladimirovich;

    public static StudentPatronym getRandomStPatronym() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
