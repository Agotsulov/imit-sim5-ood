package ru.omsu.imit.course3.strategy;

public class PrintString implements Strategy {

    private String string;

    public PrintString(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println(string);
    }
}
