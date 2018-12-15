package ru.omsu.imit.course3.singletone;

import java.util.Random;

public class Singleton {

    private static Singleton instance;
    private String s;

    private Singleton(){
        Random r = new Random();
        s = "" + r.nextInt(100);
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getString() {
        return s;
    }
}
