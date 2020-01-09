package com.company.factorymethod;

public abstract class Dialog {

    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.render();
    }
}
