package com.company.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WorldTest {

    private final long currentPopulation = 7*1000*1000*1000;

    @Before
    public void setEnumValue() {
        World world = World.INSTANCE;
        world.setPopulation(7*1000*1000*1000);
    }

    @Test
    public void testEnumTypeAlwaysReturnSameValue() {
        Assert.assertEquals(currentPopulation, World.INSTANCE.getPopulation());
    }
}
