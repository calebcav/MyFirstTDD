package hbcu.stay.ready;
import java.util.*;


import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Cat;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){

        String givenName = "Clifford";
        Date birthDate = new Date();

        Dog dog = AnimalFactory.createDog(givenName, birthDate);


        String expected = givenName;

        String actual = dog.getName();

        Assert.assertEquals(expected, actual);



    }

    @Test
    public void createCatTest(){

        String givenName = "Garfield";
        Date birthDate = new Date();

        Cat cat = AnimalFactory.createCat(givenName, birthDate);

        String expected = givenName;

        String actual = cat.getName();

        Assert.assertEquals(expected, actual);



    }


}
