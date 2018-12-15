package ru.omsu.imit.course3.cor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlerTest {

    @Test
    void testHandle() {
        Handler h1 = new PrintString("AAA-1");
        Handler h2 = new PrintString("BBB-2");
        Handler h3 = new PrintString("CCC-3");
        Handler h4 = new PrintString("DDD-4");

        h1.setNext(h4);
        h4.setNext(h2);
        h2.setNext(h3);

        h1.handle();
        System.out.println("------------------------");
        h2.handle();
    }
}