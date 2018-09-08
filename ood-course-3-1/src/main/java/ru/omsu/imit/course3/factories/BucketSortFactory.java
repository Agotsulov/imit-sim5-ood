package ru.omsu.imit.course3.factories;

import ru.omsu.imit.course3.core.Factory;
import ru.omsu.imit.course3.core.Sort;
import ru.omsu.imit.course3.sorts.BucketSort;

public class BucketSortFactory implements Factory{


    @Override
    public Sort create() {
        return new BucketSort();
    }
}
