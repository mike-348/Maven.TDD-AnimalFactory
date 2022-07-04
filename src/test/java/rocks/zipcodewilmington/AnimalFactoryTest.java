package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        //given
        Dog doug = AnimalFactory.createDog("chad", new Date());

        //when
        DogHouse.add(doug);

        //then
        Assert.assertEquals(doug, DogHouse.getDogById(0));

    }

    @Test
    public void createDogTest1() {
        //given
        Dog pickles = AnimalFactory.createDog("pickles", new Date());

        //when
        DogHouse.add(pickles);

        //then
        Assert.assertEquals(1, (int) DogHouse.getNumberOfDogs());
    }

    @Test
    public void createCatTest() {
        //given
        Cat cuddles = AnimalFactory.createCat("cuddles", new Date());

        //when
        CatHouse.add(cuddles);

        //then
        Assert.assertEquals(cuddles, CatHouse.getCatById(0));
    }

    @Test
    public void createCatTest1() {
        //given
        Cat jojo = AnimalFactory.createCat("jojo", new Date());

        //when
        CatHouse.add(jojo);

        //then
        Assert.assertEquals(1, (int) CatHouse.getNumberOfCats());
    }

}
