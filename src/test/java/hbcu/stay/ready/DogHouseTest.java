package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.*;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test

    public void addDogTest() {
        String givenName = "Scooby-Doo";
        Date date = new Date();

        Dog dog1 = AnimalFactory.createDog(givenName, date);

        DogHouse.add(dog1);


        int expected = 1;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeIntegerTest() {
        String givenName = "Scooby-Doo";
        Date date = new Date();

        Dog dog1 = AnimalFactory.createDog(givenName, date);

        DogHouse.add(dog1);

        DogHouse.remove(0);

        int expected = 0;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeDogTest() {

        String givenName = "Scooby-Doo";
        Date date = new Date();

        Dog dog1 = AnimalFactory.createDog(givenName, date);

        DogHouse.add(dog1);

        DogHouse.remove(dog1);

        int expected = 1;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void getDogByIDTest() {
        String givenName = "Scooby-Doo";
        Date date = new Date();

        Dog dog1 = AnimalFactory.createDog(givenName, date);

        DogHouse.add(dog1);

        Dog dog2 = AnimalFactory.createDog("Clifford", date);

        DogHouse.add(dog2);

        int idOne = dog1.getId();

        int idTwo = dog2.getId();

        boolean x = false;

        if (idOne == 0 && idTwo == 1){
            x = true;
        }

        Assert.assertTrue(x);


    }


    @Test
    public void getNumberOfDogsTest() {
        String givenName = "Scooby-Doo";
        Date date = new Date();

        Dog dog1 = AnimalFactory.createDog(givenName, date);

        DogHouse.add(dog1);

        int expected = 1;

        int actual = DogHouse.getNumberOfDogs();


        Assert.assertEquals(actual, expected);


    }


}
