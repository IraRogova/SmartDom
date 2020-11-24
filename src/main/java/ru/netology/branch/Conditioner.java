package ru.netology.branch;

public class Conditioner {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    private int maxTemperature = 25;
    private int minTemperature = 9;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    private int currentTemperature;
    private boolean on;
    public int increaseCurrentTemperature;
    public int decreaseCurrentTemperature;



    public void IncreaseCurrentTemperature(int increaseCurrentTemperature) {

        if (currentTemperature < maxTemperature) {

            return;
        }
        this.currentTemperature = currentTemperature +1;
    }



    public int getIncreaseCurrentTemperature() {
        return currentTemperature;
    }



    public void decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature -1;
    }

    public int getDecreaseCurrentTemperature() {
        return currentTemperature;
    }
}

