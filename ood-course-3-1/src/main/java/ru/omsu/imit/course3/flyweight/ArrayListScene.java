package ru.omsu.imit.course3.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ArrayListScene implements Scene {

    private List<GameObject> gameObjectList;
    private List<Sprite> sprites;

    private int i;

    public ArrayListScene() {
        gameObjectList = new ArrayList<>();
        sprites = new ArrayList<>();
        start();
    }

    @Override
    public void add(GameObject gameObject) {
        gameObjectList.add(gameObject);
        if (!sprites.contains(gameObject.getSprite())) {
            sprites.add(gameObject.getSprite());
        } else {
            gameObject.setSprite(gameObject.getSprite());
        }
    }

    @Override
    public void remove(GameObject gameObject) {
        gameObjectList.add(gameObject);
    }

    @Override
    public GameObject get(int i) {
        return gameObjectList.get(i);
    }

    @Override
    public void clean() {
        gameObjectList.clear();
    }

    @Override
    public void start() {
        i = 0;
    }

    @Override
    public GameObject next() {
        GameObject n = get(i);
        i++;
        return n;
    }

    @Override
    public boolean hasNext() {
        return i < gameObjectList.size();
    }

    @Override
    public String toString() {
        return "ArrayListScene{" +
                "gameObjectList=" + gameObjectList +
                ", sprites=" + sprites +
                ", i=" + i +
                '}';
    }
}
