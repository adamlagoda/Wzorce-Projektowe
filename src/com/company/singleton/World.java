package com.company.singleton;

public enum World {
    INSTANCE;

    private long population;

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

}
