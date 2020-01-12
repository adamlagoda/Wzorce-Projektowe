package com.company.structural.proxy;

public class HeavyProcessImpl implements HeavyProcess {

    public HeavyProcessImpl() {
        initialize();
    }

    private void initialize() {
        System.out.println("Initialize...");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished.");
    }

    @Override
    public void process() {
        System.out.println("Processing...");
    }
}
