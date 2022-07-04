package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.time.Month;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
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
    public void setBirthDateTest() {
        //given
        Dog d = new Dog("figgy", new Date(), null);

        //when
        d.setBirthDate(new Date());

        //then
        Assert.assertEquals(new Date(), d.getBirthDate());
    }

    @Test
    public void setBirthDateTest1() {
        //given
        Dog d = new Dog("tom", null, null);

        //when
        d.setBirthDate(new Date());

        //then
        Assert.assertNotEquals(null, d.getBirthDate());
    }


    @Test
    public void speakTest() {
        //given
        Dog d = new Dog("bart", new Date(), 5);

        //when
        d.speak();

        //then
        Assert.assertEquals("bark!", d.speak());
    }

    @Test
    public void speakTest1() {
        //given
        Dog d = new Dog("jon jon", new Date(), 8);

        //when
        d.speak();

        //then
        Assert.assertNotEquals("hello, human", d.speak());
    }


    @Test
    public void eatTest() {
        //given
        Dog d = new Dog("trevor", new Date(), 30);

        //when
        Food aPileOfTreats = new Food();
        d.eat(aPileOfTreats);

        //then
        Assert.assertEquals((int) 1, (int) d.getNumberOfMealsEaten());
    }

    @Test
    public void eatTest1() {
        //given
        Dog d = new Dog("bun bun", new Date(), 4);

        //when
        Food humanFood = new Food();
        d.eat(humanFood);

        //then
        Assert.assertNotEquals((int) 20, (int) d.getNumberOfMealsEaten());
    }

    @Test
    public void dogIsInstanceOfAnimalTest() {
        //given
        Dog d = new Dog("brent", new Date(), 21);

        //when - no method to test

        //then
        Assert.assertEquals(true, d instanceof Animal);
    }

    @Test
    public void dogIsInstanceOfMammalTest() {
        //given
        Dog d = new Dog("charlie", new Date(), 11);

        //when - no method to test

        //then
        Assert.assertEquals(true, d instanceof Mammal);
    }

}
