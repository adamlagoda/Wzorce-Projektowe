package com.company.excercise.builder;

import java.time.LocalDate;

public class Car {
    private String make;
    private String model;
    private int power;
    private LocalDate productionYear;
    private int door;
    private Color color;
    private Fuel fuel;
    private boolean english;

    private Car(){};

    public static class CarBuilder {

        private String make;
        private String model;
        private int power;
        private LocalDate productionYear;
        private int door;
        private Color color;
        private Fuel fuel;
        private boolean english;
        public CarBuilder make(String name) {
            this.make = name;
            return this;
        }

        public CarBuilder model(String name) {
            this.model = name;
            return this;
        }

        public CarBuilder power(int value) {
            this.power = value;
            return this;
        }
        public CarBuilder productionYear(LocalDate date) {
            this.productionYear = date;
            return this;
        }
        public CarBuilder door(int number) {
            this.door = number;
            return this;
        }
        public CarBuilder color(String color) {
            this.color = Color.valueOf(color.toUpperCase());
            return this;
        }
        public CarBuilder fuel(String type) {
            this.fuel = Fuel.valueOf(type.toUpperCase());
            return this;
        }
        public CarBuilder english(boolean isEnglish) {
            this.english = isEnglish;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.make = this.make;
            car.door = this.door;
            car.model = this.model;
            car.power = this.power;
            car.productionYear = this.productionYear;
            car.color = this.color;
            car.fuel = this.fuel;
            car.english = this.english;
            return car;
        }

    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public int getDoor() {
        return door;
    }

    public Color getColor() {
        return color;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public boolean isEnglish() {
        return english;
    }
}
