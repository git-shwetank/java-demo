package com.test.interfaces;

public interface CookedFruit extends Fruit {

    default boolean needsCooking() {
        return true;
    }

}