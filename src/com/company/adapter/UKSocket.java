package com.company.adapter;

public class UKSocket implements Socket {
    @Override
    public Voltage supplyVoltage() {
        return new Voltage(230);
    }
}
