package com.epam.mjc.stage0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class AnimalOverrideTest {

    @Test
    public void classDogExists() {
        Assertions.assertDoesNotThrow(() -> Class.forName("com.epam.mjc.stage0.Dog"), "Class Dog does not exist.");
    }

    @Test
    public void classDogHasNoArgsConstructor() {
        Class<Dog> dog = Dog.class;
        Constructor<?>[] declaredConstructors = dog.getDeclaredConstructors();
        Constructor<?> constructor = Arrays.stream(declaredConstructors).filter(c -> c.getParameterCount() == 0).findFirst().orElse(null);
        Assertions.assertNotNull(constructor, "There is no constructor with 0 parameters for Dog class.");
    }

    @Test
    public void getDescriptionReturnCorrectStringForDogClass() {
        Dog dog = new Dog();
        Assertions.assertEquals("This animal is mostly brown. It has 4 paws and a fur.", dog.getDescription(), "Method getDescription() does not work correctly for Dog class.");
    }

    @Test
    public void classBirdExists() {
        Assertions.assertDoesNotThrow(() -> Class.forName("com.epam.mjc.stage0.Bird"), "Class Bird does not exist.");
    }

    @Test
    public void classBirdHasNoArgsConstructor() {
        Class<Bird> bird = Bird.class;
        Constructor<?>[] declaredConstructors = bird.getDeclaredConstructors();
        Constructor<?> constructor = Arrays.stream(declaredConstructors).filter(c -> c.getParameterCount() == 0).findFirst().orElse(null);
        Assertions.assertNotNull(constructor, "There is no constructor with 0 parameters for Bird class.");
    }

    @Test
    public void getDescriptionReturnCorrectStringForBirdClass() {
        Bird bird = new Bird();
        Assertions.assertEquals("This animal is mostly blue. It has 2 paws and no fur. Moreover it has 2 wings and can fly.", bird.getDescription(), "Method getDescription() does not work correctly for Bird class.");
    }
}
