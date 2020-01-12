package com.company.structural.proxy;

import org.junit.Assert;
import org.junit.Test;

public class HeavyProcessTest {

    @Test
    public void whenUsingProxyThenObjectLazyInitialized() {
        long start = System.currentTimeMillis();
        HeavyProcess heavyProcess = new HeavyProcessProxy();
        long finish = System.currentTimeMillis();
        Assert.assertTrue(finish - start < 2000L);

        start = finish;
        heavyProcess.process();
        finish = System.currentTimeMillis();
        Assert.assertTrue(finish - start > 2000L);
    }

    @Test
    public void whenUsingPlainImplementationThanEagerInitialized() {
        long start = System.currentTimeMillis();
        HeavyProcess heavyProcess = new HeavyProcessImpl();
        long finish = System.currentTimeMillis();
        Assert.assertFalse(finish - start < 2000L);

        start = finish;
        heavyProcess.process();
        finish = System.currentTimeMillis();
        Assert.assertTrue(finish - start < 2000L);
    }
}
