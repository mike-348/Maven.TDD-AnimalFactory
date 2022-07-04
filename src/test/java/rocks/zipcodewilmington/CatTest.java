package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;

import java.time.Month;
import java.time.Year;
import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
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
        // Given (cat data)
        Cat java = new Cat("Java", new Date(), 0);

        // When (a cat is constructed)
        java.setName("Mischief");

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals("Mischief", java.getName());
    }
    @Test
    public void setNameTest1() {
        // Given a new cat object
        Cat c = new Cat("kitty", new Date(), 0);

        // When you call the method on it (change name to jasper)
        c.setName("jasper");

        // Then does the method do what you want it to do
        // True because kitty != jasper
        Assert.assertNotEquals("kitty", c.getName());
    }

    @Test
    public void setBirthDateTest() {
        // Given this input
        Cat c = new Cat("jeremiah", new Date(), 0);

        //When you send that input into the method
        Date d = new Date();

        //Then what happens
        //(expected, actual)
        Assert.assertNotEquals(null, c.getBirthDate());

    }

    @Test
    public void setBirthDateTest1() {
        // Given these parameter inputs
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenID = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        //When you send those inputs into a new instantiation of the object
        cat.setBirthDate(givenBirthDate);
        Date actual = cat.getBirthDate();

        //Then you assert that the expected is equal to the actual
        //(expected, actual)
        Assert.assertEquals(new Date().getMonth(), cat.getBirthDate().getMonth());

    }

    @Test
    public void speakTest() {
        // Given this input into the method
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenID = 0;

        //When you send that input into the method
        Cat cat = new Cat(givenName, givenBirthDate, givenID);
        cat.speak();

        //Then what happens
        //(expected, actual)
        Assert.assertEquals("meow!", cat.speak());

    }

    @Test
    public void speakTest1() {
        // Given this input into the method
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenID = 0;

        //When you send that input into a new object
        Cat cat = new Cat(givenName, givenBirthDate, givenID);
        cat.speak();

        //Then what happens
        //(expected, actual)
        Assert.assertNotEquals("bark!", cat.speak());
    }

    @Test
    public void eatFoodTest() {
        // Given
        Cat c = new Cat("Jenna", new Date(), 0);
        Food kibble = new Food();

        //When
        c.eat(kibble);

        //Then what happens
        //(expected, actual)
        Assert.assertEquals(new Integer(1),c.getNumberOfMealsEaten());

    }

    @Test
    public void eatFoodTest1() {
        //given
        Cat c = new Cat("banana", new Date(), 0);
        Food peas = new Food();

        //When
        c.eat(peas);

        //then - peas does not increase number of meals eaten to 2. Correct.
        Assert.assertNotEquals(new Integer(2), c.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest() {
        //given
        Cat c = new Cat("daniel", new Date(), 49);

        //When
        int danielID = c.getId();

        //then
        Assert.assertEquals(danielID, (int) c.getId());
    }

    @Test
    public void getIdTest1() {
        //given
        Cat c = new Cat("daniel", new Date(), 49);

        //When
        int danielID = c.getId();

        //then
        Assert.assertNotEquals(5000, (int) c.getId());
    }

    @Test
    public void checkIfAnimalTest() {
        //given
        Cat c = new Cat("pumpkin", new Date(), 80);

        //When -- no method to test

        //then
        Assert.assertEquals(true, c instanceof Animal);
    }

    @Test
    public void checkIfAnimalTest1() {
        //given
        Cat c = new Cat("john", new Date(), 1);

        //When -- no method to test

        //then
        Assert.assertNotEquals(false, c instanceof Animal);
    }


}
