package hbcu.stay.ready;


import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.*;

import java.util.*;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);



        cat.setName("Garfield");

        String expected = "Garfield";

        String actual = cat.getName();

        Assert.assertEquals(expected, actual);


    }

    @Test

    public void speakTest(){

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String actual = cat.speak();

        String expected = "meow!";

        Assert.assertEquals(actual, expected);


    }

    @Test

    public void setBirthDateTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date(2000, 11, 28);
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        int year = 2000;
        int month = 12;
        int day = 25;

        Date current = new Date(year, month, day);

        cat.setBirthDate(current);

        Date actual = cat.getBirthDate();



        Assert.assertEquals(actual, current);


    }

    @Test
    public void eatTest(){

        String givenName = "Zula";
        Date givenBirthDate = new Date(2000, 11, 28);
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Food burger = new Food();

        cat.eat(burger);
        cat.eat(burger);

        int actual = 0;

        int expected = 1;

        if (cat.getNumberOfMealsEaten() == 2){
            actual = 1;
        }

        Assert.assertEquals(actual, expected);



    }

    @Test
    public void getIDTest(){


        String givenName = "Zula";
        Date givenBirthDate = new Date(2000, 11, 28);
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        Integer actual = cat.getId();

        Integer expected = 0;

        Assert.assertEquals(actual, expected);


    }


    @Test
    public void animalInheritanceTest(){

        String givenName = "Zula";
        Date givenBirthDate = new Date(2000, 11, 28);
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test

    public void mammalInheritanceTest(){

        String givenName = "Zula";
        Date givenBirthDate = new Date(2000, 11, 28);
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);



        Assert.assertTrue(cat instanceof Mammal);



    }


}
