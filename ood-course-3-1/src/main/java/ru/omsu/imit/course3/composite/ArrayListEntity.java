package ru.omsu.imit.course3.composite;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEntity implements Entity {

    private List<Entity> entities;
    private Component component;

    public ArrayListEntity(Component component) {
        entities = new ArrayList<>();
        this.component = component;
    }

    @Override
    public void execute() {
        component.execute();
        for (Entity e: entities) {
            e.execute();
        }
    }

    @Override
    public void add(Entity e) {
        entities.add(e);
    }

    @Override
    public void remove(Entity e) {
        entities.remove(e);
    }

    @Override
    public List<Entity> getChildren() {
        return entities;
    }

}
