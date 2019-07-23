package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;

import java.util.*;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void dogTest(){

        String givenName = "Scooby";
        Date birthDate = new Date();
        Integer id = 0;

        Dog dog = new Dog(givenName, birthDate, id);

    }
    @Test
    public void speakTest(){

        String givenName = "Scooby";
        Date birthDate = new Date();
        Integer id = 0;

        Dog dog = new Dog(givenName, birthDate, id);

        String actual = dog.speak();

        String expected = "bark!";

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void setBirthDateTest(){
        String givenName = "Scooby";
        Date birthDate = new Date();
        Integer id = 0;

        Dog dog = new Dog(givenName, birthDate, id);

        Date date = new Date(2018, 8, 3);

        dog.setBirthDate(date);

        Date actual = dog.getBirthDate();

        Date expected = date;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void eatTest(){
        String givenName = "Scooby";
        Date birthDate = new Date();
        Integer id = 0;

        Dog dog = new Dog(givenName, birthDate, id);

        Food scoobySnacks = new Food();

        dog.eat(scoobySnacks);

        if (dog.getNumberOfMealsEaten() == 1){

            Assert.assertTrue(true);

        }
        else {
            Assert.assertTrue(false);
        }



    }

    @Test
    public void getIDTest(){

        String givenName = "Scooby";
        Date birthDate = new Date();
        Integer id = 0;

        Dog dog = new Dog(givenName, birthDate, id);

        Integer expected = 0;



        Assert.assertEquals(dog.getId(), expected);



    }

    @Test
    public void animalInheritanceTest(){

        String givenName = "Scooby";
        Date birthDate = new Date();
        Integer id = 0;

        Dog dog = new Dog(givenName, birthDate, id);

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest(){
        String givenName = "Scooby";
        Date birthDate = new Date();
        Integer id = 0;

        Dog dog = new Dog(givenName, birthDate, id);

        Assert.assertTrue(dog instanceof Mammal);

    }


}
