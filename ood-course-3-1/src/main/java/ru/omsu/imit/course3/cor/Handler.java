package ru.omsu.imit.course3.cor;

public interface Handler {

    void handle();

    void setNext(Handler next);

}
