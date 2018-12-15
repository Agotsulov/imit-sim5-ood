package ru.omsu.imit.course3.strategy;

public class PrintInt implements Strategy{

    private int i;

    public PrintInt(int i) {
        this.i = i;
    }

    @Override
    public void execute() {
        System.out.println(i);
    }
}
