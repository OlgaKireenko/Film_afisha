package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerTestNonEmpty {
    @Test
    public void shouldAddAndGetAll() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, 1, "first", 1, 1);
         Film second = new Film(2, 2, "second", 1, 1);
         Film third = new Film(3, 3, "third", 1, 1);
         Film fourth = new Film(4, 4, "fourth", 1, 1);
         Film fifth = new Film(5, 5, "fifth", 1, 1);
         Film sixth = new Film(6, 6, "6", 1, 1);
         Film seventh = new Film(7, 7, "7", 1, 1);
         Film eighth = new Film(8, 8, "8", 1, 1);
         Film ninth = new Film(9, 9, "9", 1, 1);
         Film tenth = new Film(10, 10, "10", 1, 1);
         Film eleventh = new Film(11, 11, "11", 1, 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};


//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAdd2() {
        FilmManager manager = new FilmManager();

        Film first = new Film(1, 1, "first", 1, 1);
        Film second = new Film(2, 2, "second", 1, 1);
        Film third = new Film(3, 3, "third", 1, 1);
        Film fourth = new Film(4, 4, "fourth", 1, 1);
        Film fifth = new Film(5, 5, "fifth", 1, 1);
        Film sixth = new Film(6, 6, "6", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Film[] actual = manager.getAll();

        Film[] expected = new Film[]{sixth, fifth, fourth, third, second, first};


//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldGetAllWithConstructor() {
        FilmManager manager = new FilmManager(5);
        Film first = new Film(1, 1, "first", 1, 1);
        Film second = new Film(2, 2, "second", 1, 1);
        Film third = new Film(3, 3, "third", 1, 1);
        Film fourth = new Film(4, 4, "fourth", 1, 1);
        Film fifth = new Film(5, 5, "fifth", 1, 1);
        Film sixth = new Film(6, 6, "6", 1, 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{sixth, fifth, fourth, third, second};


//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);

    }


}

