package ru.omsu.imit.course3.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponentTest {

    @Test
    public void testClone() {
        Component c1 = new Position(10 ,20);
        Component c2 = c1.clone();

        assertEquals(c1, c2);
    }
}