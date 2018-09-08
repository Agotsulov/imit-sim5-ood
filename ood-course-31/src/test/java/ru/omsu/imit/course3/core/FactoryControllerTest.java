package ru.omsu.imit.course3.core;

import org.junit.jupiter.api.Test;
import ru.omsu.imit.course3.factories.BucketSortFactory;
import ru.omsu.imit.course3.factories.InsertIntoSortFactory;
import ru.omsu.imit.course3.factories.SelectionSortFactory;

import static org.junit.jupiter.api.Assertions.*;

class FactoryControllerTest {

    @Test
    void testInterIntoSort(){
        FactoryController fc = new FactoryController();

        fc.put("InsertInto", new InsertIntoSortFactory());
        fc.put("Bucket", new BucketSortFactory());
        fc.put("Selection", new SelectionSortFactory());

        int [] expect = {0, 1, 3, 5, 10};
        int [] actual = {10, 5, 0, 1, 3};

        assertArrayEquals(expect, fc.use("InsertInto", actual));
    }


    @Test
    void testBucketSort(){
        FactoryController fc = new FactoryController();

        fc.put("InsertInto", new InsertIntoSortFactory());
        fc.put("Bucket", new BucketSortFactory());
        fc.put("Selection", new SelectionSortFactory());

        int [] expect = {0, 1, 3, 5, 10};
        int [] actual = {10, 5, 0, 1, 3};

        assertArrayEquals(expect, fc.use("Bucket", actual));
    }

    @Test
    void testSelectionSort(){
        FactoryController fc = new FactoryController();

        fc.put("InsertInto", new InsertIntoSortFactory());
        fc.put("Bucket", new BucketSortFactory());
        fc.put("Selection", new SelectionSortFactory());

        int [] expect = {0, 1, 3, 5, 10};
        int [] actual = {10, 5, 0, 1, 3};

        assertArrayEquals(expect, fc.use("Selection", actual));
    }

}