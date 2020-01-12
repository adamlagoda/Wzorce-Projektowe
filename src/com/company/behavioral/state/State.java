package com.company.behavioral.state;

public abstract class State {
    protected GitFile file;

    public State(GitFile file) {
        this.file = file;
    }

    public abstract void add();
    public abstract String status();
}
