package com.company.proxy;

public class HeavyProcessProxy implements HeavyProcess {
    private static HeavyProcess heavyProcess;

    @Override
    public void process() {
        if (heavyProcess == null) {
            heavyProcess = new HeavyProcessImpl();
        }
        heavyProcess.process();
    }
}
