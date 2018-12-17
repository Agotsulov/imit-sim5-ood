package ru.omsu.imit.course3.memento;

public class Originator {

    private StringBuilder stringBuilder;

    public Originator() {
        stringBuilder = new StringBuilder();
    }


    public void add(String s) {
        stringBuilder.append(s);
    }

    public Memento save() {
        return new Memento(stringBuilder.toString());
    }

    public void restore(Memento memento) {
        stringBuilder = new StringBuilder(memento.getString());
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
