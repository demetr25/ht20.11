package com.company;

import java.util.Random;

public enum CarName {
    TOYOTA,
    NISSAN,
    BMW,
    VOLKSWAGEN;

    public static CarName getRandomName() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
