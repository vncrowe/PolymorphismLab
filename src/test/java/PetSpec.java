import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by veronicacrowe on 5/19/16.
 */
public class PetSpec {
    Pet pet = new Pet("Pet");
    Pet dog = new Dog("Dog");
    Pet cat = new Cat("Cat");
    Pet panada = new Panada("Panada");


    @Test
    public void checkPetSpeakTest() {
        String expectedValue = "It's a pet";
        String actualValue = pet.speak();
        assertEquals("The speak method should return It's a pet", expectedValue, actualValue);


    }

    @Test
    public void checkDogSpeakTest() {
        String expectedValue = "Woof!";
        String actualValue = dog.speak();
        assertEquals("The speak method should return Woof", expectedValue, actualValue);


    }

    @Test
    public void checkCatSpeakTest() {
        String expectedValue = "Meow";
        String actualValue = cat.speak();
        assertEquals("The speak method should return Meow", expectedValue, actualValue);
    }

    @Test
    public void checkPanadaSpeakTest() {
        String expectedValue = "Roar!";
        String actualValue = panada.speak();
        assertEquals("The speak method should return Roar", expectedValue, actualValue);


    }
}
