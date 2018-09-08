package ru.omsu.imit.course3.factories;

import ru.omsu.imit.course3.core.Factory;
import ru.omsu.imit.course3.core.Sort;
import ru.omsu.imit.course3.sorts.InsertIntoSort;

public class InsertIntoSortFactory implements Factory {

    @Override
    public Sort create() {
        return new InsertIntoSort();
    }
}
