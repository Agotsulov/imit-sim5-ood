package ru.omsu.imit.course3.flyweight;

import java.util.Objects;

public class Sprite {

    private String string;

    public Sprite(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sprite sprite = (Sprite) o;
        return Objects.equals(string, sprite.string);
    }

    @Override
    public int hashCode() {

        return Objects.hash(string);
    }
}
