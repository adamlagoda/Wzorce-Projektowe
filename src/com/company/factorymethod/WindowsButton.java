package com.company.factorymethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.print("Rendered Windows Button");
    }
}
