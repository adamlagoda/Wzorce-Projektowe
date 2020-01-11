package com.company.excercise;

import com.company.singleton.World;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassicWorldTest {
    private final long currentPopulation = 7*1000*1000*1000;

    @Before
    public void setSingletonValue() {
        ClassicWorld world = ClassicWorld.getInstance();
        world.setPopulation(7*1000*1000*1000);
    }

    @Test
    public void testClassicSingletonGloballyAccessible() {
        Assert.assertEquals(currentPopulation, ClassicWorld.getInstance().getPopulation());
    }
}
