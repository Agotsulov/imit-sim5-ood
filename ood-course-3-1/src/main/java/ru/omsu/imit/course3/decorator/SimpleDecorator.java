package ru.omsu.imit.course3.decorator;

public class SimpleDecorator implements Data{

    private String s;

    @Override
    public void write(String s) {
        this.s = s;
    }

    @Override
    public String read() {
        return s;
    }
}
