package com.test.interfaces;

public interface Fruit {

    default boolean needsCooking() {
        return false;
    }

    public boolean hasSeeds();

    public String outerColor();

    public String innerColor();

    public boolean isJuiceExtracted();

}