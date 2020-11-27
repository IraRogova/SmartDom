package ru.netology.branch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {


    @Test
    public void shouldSetCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(25);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldSetCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(24);
        assertEquals(24, conditioner.getMaxTemperature());
    }

    @Test
    public void shouldSetCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(8);
        assertEquals(0, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldSetCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(9);
        assertEquals(9, conditioner.getMinTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureBetweenMinMax() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(24);
        assertEquals(24, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureBetweenMinMax() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(10);
        assertEquals(10, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(9, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(9);
        assertEquals(9, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(9, conditioner.getCurrentTemperature());
    }


}