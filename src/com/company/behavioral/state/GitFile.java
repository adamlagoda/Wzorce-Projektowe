package com.company.behavioral.state;

public class GitFile implements State {

    private AbstractState state;

    public GitFile() {
        this.state = new Untracked(this);
    }

    public void changeState(AbstractState state) {
        this.state = state;
    }

    @Override
    public void add() {
        state.add();
    }

    @Override
    public String status() {
        return state.status();
    }
}
