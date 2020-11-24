package ru.netology.branch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldReturnIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(24);
        assertEquals(24, conditioner.getMaxTemperature());
        conditioner.setCurrentTemperature(24);
        assertEquals(24, conditioner.getCurrentTemperature());
        conditioner.setIncreaseCurrentTemperature(24);
        assertEquals(25, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    public void shouldReturnDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-14);
        assertEquals(-14, conditioner.getMinTemperature());
        conditioner.setDecreaseCurrentTemperature(-14);
        assertEquals(-15, conditioner.getDecreaseCurrentTemperature());

    }


    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected,conditioner.getName());

    }

  /*  @Test
    public void shouldCheckChangeTemperature() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(-20);
        assertEquals(0, conditioner.getCurrentTemperature());

    }*/


}