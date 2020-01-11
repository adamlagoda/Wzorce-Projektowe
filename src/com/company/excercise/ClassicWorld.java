package com.company.excercise;

public class ClassicWorld {

    private static ClassicWorld instance;
    private long population;

    private ClassicWorld() {
    }

    public static ClassicWorld getInstance() {
        if (instance == null)
            instance = new ClassicWorld();
        return instance;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
