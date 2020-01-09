package com.company.adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void whenAdapterUsedThanPowerSupplied() {
        Appliance appliance = new Appliance();
        Socket ukSocket = new UKSocket();
        SocketAdapter europeanSocketAdapter = new EuropeanSocketAdapter(ukSocket);
        appliance.power(europeanSocketAdapter.supplyVoltage());

        Assert.assertTrue(appliance.isPlugged());
    }

    @Test
    public void whenIncompatibleSocketsThanPowerNotSupplied() {
        Appliance appliance = new Appliance();
        Socket ukSocket = new UKSocket();
        appliance.power(ukSocket.supplyVoltage());

        Assert.assertFalse(appliance.isPlugged());
    }
}
