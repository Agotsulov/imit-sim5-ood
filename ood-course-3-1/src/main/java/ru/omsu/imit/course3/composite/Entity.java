package ru.omsu.imit.course3.composite;

import java.util.List;

public interface Entity {

    void execute();

    void add(Entity e);

    void remove(Entity e);

    List<Entity> getChildren();

}
