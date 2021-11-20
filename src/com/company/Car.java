package com.company;

public class Car {
    CarName name;
    CarColors color;
    int maxSpeed;

    public Car(CarName name, CarColors color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
