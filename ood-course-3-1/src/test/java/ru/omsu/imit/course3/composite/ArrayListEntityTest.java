package ru.omsu.imit.course3.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListEntityTest {

    @Test
    public void testExecute() {
        Entity main = new ArrayListEntity(new Position(10, 20));
        main.add(new ArrayListEntity(new Position(1, 1)));
        main.add(new ArrayListEntity(new Position(1, 2)));
        main.add(new ArrayListEntity(new Position(1, 3)));

        Entity leaf = new ArrayListEntity(new Position(0 , 0));

        main.add(leaf);

        leaf.add(new ArrayListEntity(new Position(0, 1)));
        leaf.add(new ArrayListEntity(new Position(0, 2)));
        leaf.add(new ArrayListEntity(new Position(0, 3)));
        leaf.add(new ArrayListEntity(new Position(0, 4)));

        main.execute();
    }
}