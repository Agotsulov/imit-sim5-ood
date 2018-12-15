package ru.omsu.imit.course3.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {

    @Test
    void testSomething() {
        Context context = new Context();
        Strategy first = new PrintString("AAAAAAAAAAAaaa");
        context.setStrategy(first);
        context.doSomething();
        Strategy other = new PrintInt(123);
        context.setStrategy(other);
        context.doSomething();

    }
}