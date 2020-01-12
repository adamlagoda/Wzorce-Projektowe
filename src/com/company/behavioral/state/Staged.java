package com.company.behavioral.state;

public class Staged extends AbstractState {

    public Staged(GitFile file) {
        super(file);
    }

    @Override
    public String status() {
        return "Staged";
    }

    @Override
    public void add() {
        return;
    }
}
