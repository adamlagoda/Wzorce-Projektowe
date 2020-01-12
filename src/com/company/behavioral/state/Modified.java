package com.company.behavioral.state;

public class Modified extends AbstractState {

    public Modified(GitFile file) {
        super(file);
    }

    @Override
    public String status() {
        return "Modified";
    }

    public void add() {
        file.changeState(new Staged(file));
    }
}
