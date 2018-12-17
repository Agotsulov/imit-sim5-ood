package ru.omsu.imit.course3.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList;
    private Originator originator;

    public Caretaker(final Originator originator) {
        this.originator = originator;
        mementoList = new ArrayList<>();
    }

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public void undo() {
        if(mementoList.size() > 0)
            originator.restore(mementoList.remove(mementoList.size() - 1));
    }

}
