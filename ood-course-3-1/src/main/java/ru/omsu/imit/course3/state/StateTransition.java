package ru.omsu.imit.course3.state;

public final class StateTransition {

    private final StateMap stateMap;

    public StateTransition() {
        this.stateMap = new StateMap();
    }

    public State nextState(final State state, final String p) {
        return stateMap.getNextState(state, p);
    }

    public State getStartState() {
        return this.stateMap.getStartState();
    }
}
