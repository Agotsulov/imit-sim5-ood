package ru.omsu.imit.course3.flyweight;

public class GameObject {

    private Sprite sprite;

    public GameObject(Sprite sprite) {
        this.sprite = sprite;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }
}
