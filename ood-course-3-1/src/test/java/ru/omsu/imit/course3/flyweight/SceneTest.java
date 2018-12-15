package ru.omsu.imit.course3.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SceneTest {

    @Test
    void test() {
        Scene scene = new ArrayListScene();
        scene.add(new GameObject(new Sprite("AAA")));
        scene.add(new GameObject(new Sprite("AAA")));
        scene.add(new GameObject(new Sprite("AAA")));
        scene.add(new GameObject(new Sprite("AAA")));
        scene.add(new GameObject(new Sprite("aaa")));
        scene.add(new GameObject(new Sprite("bbb")));
        scene.add(new GameObject(new Sprite("ccc")));
        scene.add(new GameObject(new Sprite("ccc")));
        scene.add(new GameObject(new Sprite("ccccccc")));

        while (scene.hasNext()) {
            GameObject next = scene.next();
            System.out.println(next.getSprite().getString());
            System.out.println(next.getSprite());
        }

    }
}