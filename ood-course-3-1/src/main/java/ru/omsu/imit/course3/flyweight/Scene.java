package ru.omsu.imit.course3.flyweight;

public interface Scene extends Iterator<GameObject>{

    void add(GameObject gameObject);

    void remove(GameObject gameObject);

    GameObject get(int i);

    void clean();


}
