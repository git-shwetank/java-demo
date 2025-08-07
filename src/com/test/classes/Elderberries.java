package com.test.classes;

import com.test.interfaces.*;

public class Elderberries implements Fruit, CookedFruit {

    private final boolean hasSeeds = true;
    private final String outerColor = "black";
    private final String innerColor = "purple";
    private final boolean juiceExtracted = true;

    public static void main(String[] args) {

        Elderberries elderberries = new Elderberries();

        System.out.println("Fruit name: " + elderberries.getClass().getName());
        System.out.println("Is Juice Extracted: " + elderberries.isJuiceExtracted());
        System.out.println("Cooking Mandatory: " + elderberries.isCookingMandatory());

    }

    public String outerColor() {
        return outerColor;
    }

    public String innerColor() {
        return innerColor;
    }

    public boolean hasSeeds() {
        return hasSeeds;
    }

    public boolean isJuiceExtracted() {
        return juiceExtracted;
    }

    public boolean isCookingMandatory() {
        return needsCooking();
    }


}