package ru.netology.branch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldReturnIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

       /*conditioner.setMaxTemperature(24);
        assertEquals(24, conditioner.getMaxTemperature());
        conditioner.setCurrentTemperature(24);
        assertEquals(24, conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(25, conditioner.getCurrentTemperature());*/

        conditioner.setCurrentTemperature(24);
        assertEquals(24, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(9);
        assertEquals(9, conditioner.getMinTemperature());
        conditioner.setCurrentTemperature(10);
        assertEquals(10, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(9, conditioner.getCurrentTemperature());

    }


    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected,conditioner.getName());

    }

  @Test
    public void shouldCheckChangeTemperature() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(-20);
        assertEquals(0, conditioner.getCurrentTemperature());

    }


}