package ru.omsu.imit.course3.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.execute();
    }
}
