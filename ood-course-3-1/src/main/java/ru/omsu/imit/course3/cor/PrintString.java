package ru.omsu.imit.course3.cor;

public class PrintString implements Handler {

    private Handler next;
    private String string;

    public PrintString(String string) {
        this.string = string;
    }

    @Override
    public void handle() {
        System.out.println(string);
        if (next != null) {
            next.handle();
        }
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
}
