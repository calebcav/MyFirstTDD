package hbcu.stay.ready;
import java.util.*;
import hbcu.stay.ready.animals.*;


import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.animal_storage.*;
import org.junit.Assert;
import org.junit.Test;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`



    @Test
    public void addCatTest(){

        String givenName = "Garfield";
        Date date = new Date();

        Cat cat = AnimalFactory.createCat(givenName, date);

        CatHouse.add(cat);

        int actual = CatHouse.getNumberOfCats();
        int expected = 1;

        Assert.assertEquals(actual, expected);



    }


    @Test
    public void removeIDTest(){
        String givenName = "Garfield";
        Date date = new Date();

        Cat cat = AnimalFactory.createCat(givenName, date);

        CatHouse.add(cat);

        CatHouse.remove(0);

        int expected = 0;

        int actual = CatHouse.getNumberOfCats();


        Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeCatTest(){
        String givenName = "Garfield";
        Date date = new Date();

        Cat cat = AnimalFactory.createCat(givenName, date);

        CatHouse.add(cat);

        CatHouse.remove(cat);

        int expected = 0;

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);



    }

    @Test
    public void getCatByIDTest(){
        String givenName = "Garfield";
        Date date = new Date();

        Cat cat = AnimalFactory.createCat(givenName, date);
        CatHouse.add(cat);
        Cat cat2 = AnimalFactory.createCat("Spot", date);
        CatHouse.add(cat2);


        System.out.println(cat.getId());
        System.out.println(cat2.getId());




        int id1 = cat.getId();
        int id2 = cat2.getId();
        boolean x = false;


        if (id1 == 0 && id2 == 1){
            x = true;
        }

        Assert.assertTrue(x);

    }
    @Test
    public void getNumberOfCatsTest(){
        String givenName = "Garfield";
        Date date = new Date();

        Cat cat = AnimalFactory.createCat(givenName, date);
        CatHouse.add(cat);
        Cat cat2 = AnimalFactory.createCat("Spot", date);
        CatHouse.add(cat2);

        int expected = 2;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);

    }



}
