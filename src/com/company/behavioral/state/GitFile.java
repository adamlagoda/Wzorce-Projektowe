package com.company.behavioral.state;

public class GitFile {

    private State state;

    public GitFile() {
        this.state = new Untracked(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String getStatusMessage() {
        return state.status();
    }

    public void addFile() {
        state.add();
    }
}
