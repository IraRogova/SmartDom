package ru.netology.branch;

public class Conditioner {

    private int currentTemperature;
    private boolean on;
    private String name;
    private int maxTemperature = 24;
    private int minTemperature = 9;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {

        if (currentTemperature < maxTemperature) {
           return;
        }
        currentTemperature++;


}
    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            currentTemperature--;
        }
    }


}

