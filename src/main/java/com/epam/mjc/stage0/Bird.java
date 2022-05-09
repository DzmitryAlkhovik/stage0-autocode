package com.epam.mjc.stage0;

/**
 * Task 2(part 2)
 * 1. Create 2 new classes Dog and Bird and extend them with the help of Animal.
 * 2. Create no-args constructor for each where provide all necessary information for Animal constructor by super() method:
 * * for Dog: color - brown, numberOfPaws - 4, hasFur - true;
 * * for Bird: color blue, numberOfPaws - 2, hasFur - false.
 * 3. Override getDescription() method for class Bird: add one more sentence to the description. The result one must be "This animal is mostly blue. It has 2 paws and no fur. Moreover it has 2 wings and can fly."
 * (optional) 4. Create an object of each and call getDescription() method for both classes. Try to explain the output results.
 */
public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" Moreover it has 2 wings and can fly.");
    }
}
