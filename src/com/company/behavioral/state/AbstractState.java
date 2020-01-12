package com.company.behavioral.state;

public abstract class AbstractState implements State {
    protected GitFile file;

    public AbstractState(GitFile file) {
        this.file = file;
    }

}
