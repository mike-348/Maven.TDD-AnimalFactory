package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        //given
        // Cat c = new Cat("c", new Date()) why doesn't this work <--??
        Cat c = AnimalFactory.createCat("c", new Date());

        //when
        CatHouse.add(c);

        //then
        Assert.assertEquals(1, (int) CatHouse.getNumberOfCats());
    }

    @Test
    public void addCatTest1() {
        //given
        Cat chat = AnimalFactory.createCat("chat", new Date());

        //when
        CatHouse.add(chat);

        //then
        Assert.assertEquals(chat, CatHouse.getCatById(0));
    }

    @Test
    public void removeCat() {
        //given
        Cat ian = AnimalFactory.createCat("ian", new Date());
        CatHouse.add(ian);

        //when
        CatHouse.remove(ian);

        //then
        Assert.assertEquals(null, CatHouse.getCatById(0));
    }

    @Test
    public void removeCat1() {
        //given
        Cat ian = AnimalFactory.createCat("ian", new Date());
        CatHouse.add(ian);

        //when
        CatHouse.remove(ian);

        //then
        Assert.assertNotEquals(ian, CatHouse.getCatById(0));
    }

    @Test
    public void removeCat2() {
        //given
        Cat ian = AnimalFactory.createCat("ian", new Date());
        CatHouse.add(ian);

        //when
        CatHouse.remove(ian);

        //then
        Assert.assertEquals(0, (int) CatHouse.getNumberOfCats());
    }

    @Test
    public void getCatByIdTest() {
        //given
        Cat jonjon = AnimalFactory.createCat("jonjon", new Date());
        CatHouse.add(jonjon);

        //when
        CatHouse.getCatById(0);

        //then
        Assert.assertEquals(jonjon, CatHouse.getCatById(0));
    }

    @Test
    public void getCatByIdTest1() {
        //given
        Cat jonjon = AnimalFactory.createCat("jonjon", new Date());
        CatHouse.add(jonjon);
        Cat piper = AnimalFactory.createCat("piper", new Date());
        CatHouse.add(piper);
        Cat ronald = AnimalFactory.createCat("ronald", new Date());
        CatHouse.add(ronald);
        Cat fred = AnimalFactory.createCat("fred", new Date());
        CatHouse.add(fred);

        //when
        Cat actual = CatHouse.getCatById(3);

        //then
        System.out.print(CatHouse.getCatById(1));
        System.out.print(CatHouse.getCatById(0));
        Assert.assertEquals(fred, actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        //given
        Cat jonjon = AnimalFactory.createCat("jonjon", new Date());
        CatHouse.add(jonjon);

        //when
        int actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void getNumberOfCatsTest1() {
        //given
        Cat jonjon = AnimalFactory.createCat("jonjon", new Date());
        CatHouse.add(jonjon);
        Cat piper = AnimalFactory.createCat("piper", new Date());
        CatHouse.add(piper);
        Cat ronald = AnimalFactory.createCat("ronald", new Date());
        CatHouse.add(ronald);
        Cat fred = AnimalFactory.createCat("fred", new Date());
        CatHouse.add(fred);

        //when
        int actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(4, actual);
    }

    @Test
    public void getNumberOfCatsTest2() {
        //given
        Cat jonjon = AnimalFactory.createCat("jonjon", new Date());
        CatHouse.add(jonjon);
        Cat piper = AnimalFactory.createCat("piper", new Date());
        CatHouse.add(piper);
        Cat ronald = AnimalFactory.createCat("ronald", new Date());
        CatHouse.add(ronald);
        Cat fred = AnimalFactory.createCat("fred", new Date());
        CatHouse.add(fred);

        CatHouse.remove(jonjon);

        //when
        int actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(3, actual);
    }
}
