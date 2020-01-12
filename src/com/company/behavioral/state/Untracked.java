package com.company.behavioral.state;

public class Untracked extends AbstractState {

    public Untracked(GitFile file) {
        super(file);
    }

    @Override
    public String status() {
        return "Untracked";
    }

    public void add() {
        file.changeState(new Staged(file));
    }
}
