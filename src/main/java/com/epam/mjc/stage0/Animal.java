package com.epam.mjc.stage0;

/**
 * 1. Create class Animal.
 * 2. Provide it with 3 private fields - color(String), numberOfPaws(int), hasFur(boolean).
 * 3. Add constructor with full parameters.
 * 4. Add a methods getDescription(), witch would use class fields and return a string with such pattern "This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."
 * (optional) 5. In the method getDescription() change the word 'paw' depending on the numberOfPaws: number of paws is 1 -> 'paw', number of paws is different from 1 -> 'paws'.
 */
public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return String.format("This animal is mostly %s. It has %s paw%s and %s fur.",
                color, numberOfPaws, numberOfPaws == 1 ? "" : "s", hasFur ? "a" : "no");
    }
}
