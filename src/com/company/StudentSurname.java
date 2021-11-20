package com.company;

import java.util.Random;

public enum StudentSurname {
    Petrov,
    Rudenko,
    Vasilenko,
    Ostapchuk,
    Berezhnoy;

    public static StudentSurname getRandomStSurname() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}