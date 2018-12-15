package ru.omsu.imit.course3.flyweight;

public interface Iterator<T> {

    void start();

    T next();

    boolean hasNext();

}
