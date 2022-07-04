package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDog() {
        //given
        Dog trevor = AnimalFactory.createDog("trevor", new Date());

        //when
        DogHouse.add(trevor);

        //then
        Assert.assertEquals(1,(int) DogHouse.getNumberOfDogs());
    }

    @Test
    public void testAddDog1() {
        //given
        Dog trevor = AnimalFactory.createDog("trevor", new Date());

        //when
        DogHouse.add(trevor);

        //then
        Assert.assertEquals(trevor,DogHouse.getDogById(0));
    }

    @Test
    public void removeDogTest() {
        //given
        Dog trevor = AnimalFactory.createDog("trevor", new Date());

        //when
        DogHouse.add(trevor);
        DogHouse.remove(trevor);

        //then
        Assert.assertEquals(0, (int)DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDogTest1() {
        //given
        Dog trevor = AnimalFactory.createDog("trevor", new Date());
        Dog yuri = AnimalFactory.createDog("yuri", new Date());

        //when
        DogHouse.add(trevor);
        DogHouse.add(yuri);
        DogHouse.remove(trevor);

        //then
        Assert.assertEquals(1, (int)DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDogTest2() {
        //given
        Dog trevor = AnimalFactory.createDog("trevor", new Date());

        //when
        DogHouse.add(trevor);
        DogHouse.remove(trevor);

        //then
        Assert.assertEquals(null, DogHouse.getDogById(0));
    }

    @Test
    public void getNumberOfDogsTest() {
        //given
        Dog trevor = AnimalFactory.createDog("trevor", new Date());
        Dog yuri = AnimalFactory.createDog("yuri", new Date());
        Dog tom = AnimalFactory.createDog("tom", new Date());

        //when
        DogHouse.add(trevor);
        DogHouse.add(yuri);
        DogHouse.add(tom);

        //then
        Assert.assertEquals((Integer) 3, DogHouse.getNumberOfDogs());
    }

}
