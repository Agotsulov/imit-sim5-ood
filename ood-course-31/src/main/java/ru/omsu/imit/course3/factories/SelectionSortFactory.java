package ru.omsu.imit.course3.factories;

import ru.omsu.imit.course3.core.Factory;
import ru.omsu.imit.course3.core.Sort;
import ru.omsu.imit.course3.sorts.SelectionSort;

public class SelectionSortFactory implements Factory{

    @Override
    public Sort create() {
        return new SelectionSort();
    }
}
