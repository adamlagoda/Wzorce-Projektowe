package com.company.excercise;

import com.company.excercise.builder.Car;
import com.company.excercise.builder.Color;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class CarBuilderTest {

    @Test
    public void testCarBuilder() {
        Car.CarBuilder builder = new Car.CarBuilder();
        Car car = builder
                .color("Black")
                .door(2)
                .power(600)
                .productionYear(LocalDate.of(2020, 1, 1))
                .build();
        Assert.assertEquals(Color.BLACK, car.getColor());
        Assert.assertEquals(2, car.getDoor());
        Assert.assertEquals(600, car.getPower());
        Assert.assertEquals(LocalDate.of(2020, 1, 1), car.getProductionYear());
    }
}
