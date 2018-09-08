package ru.omsu.imit.course3.core;

import java.util.HashMap;

public class FactoryController extends HashMap<String, Factory> {

    public int[] use(String sortName,int [] array) {
        return get(sortName).create().sort(array);
    }

}
