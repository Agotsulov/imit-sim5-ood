package ru.omsu.imit.course3.singletone;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void testGetInstance() {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getString());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getString());
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3.getString());
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

    }
}