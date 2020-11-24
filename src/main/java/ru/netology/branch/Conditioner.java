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

    private int maxTemperature;
    private int minTemperature;

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



    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
        this.increaseCurrentTemperature = increaseCurrentTemperature;
        if (currentTemperature < maxTemperature) {

            return;
        }
    }



    public int getIncreaseCurrentTemperature() {
        return maxTemperature +1;
    }



    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
        this.decreaseCurrentTemperature = decreaseCurrentTemperature;
        if (currentTemperature >= minTemperature) {
            return;
        }
    }



    public int getDecreaseCurrentTemperature() {
        return minTemperature -1;
    }
}

