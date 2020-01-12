package com.company.structural.adapter;

public class Appliance {
    public boolean isPlugged() {
        return plugged;
    }

    private boolean plugged;

    public void power(Voltage voltage) {
        if (!plugged) {
            if (voltage.getVoltage() > 220) {
                System.out.println("Crash!");
            } else if (voltage.getVoltage() == 0) {
                System.out.println("No power in socket");
            } else {
                plugged = true;
            }
        } else {
            System.out.println("Already plugged");
        }
    }
}
