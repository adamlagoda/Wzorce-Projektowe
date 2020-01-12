package com.company.creational.factorymethod;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.print("Rendered HTML Button");
    }
}
