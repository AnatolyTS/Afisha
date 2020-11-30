package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import ru.netology.manager.AfishaManager;
import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager(10);
    @Test
    public void shpuldAdd() {
        Film first = new Film(1, "Bloodshot", "actions");
        Film second = new Film(2, "Forward", "cartoon");
        Film third = new Film(3, "Hotel Belgrad", "comedy");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        Film[] actual = manager.getLastAddedItems();
        Film[] expected = new Film[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getAfishaEmpty() {
        Film[] actual = manager.getLastAddedItems();
        Film[] expected = new Film[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMoreThanMax() {
        Film first = new Film(1, "Bloodshot", "actions");
        Film second = new Film(2, "Forward", "cartoon");
        Film third = new Film(3, "Hotel Belgrad", "comedy");
        Film fourth = new Film(4, "The Gentelmen", "action");
        Film fifth = new Film(5, "The Invisible man", "horror");
        Film sixth = new Film(6, "Trolls World Tour", "cartoon");
        Film seventh = new Film(7, "Number One", "comedy");
        Film eight = new Film(8, "Spider-Man", "action");
        Film ninth = new Film(9, "Batman", "action");
        Film tenth = new Film(10, "Superman", "action");


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);

        Film[] actual = manager.getLastAddedItems();
        Film[] expected = new Film[]{tenth, ninth, eight, seventh, sixth, fifth, fourth, third, second,first};

        assertArrayEquals(expected, actual);

    }
}
