package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Methods.checkPersonCount;
import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {


    @Test
    public void testCheckPersonCountRedLevel() {
        // Test for person count above 0 when alarm level is red
        assertEquals("Zu viele Personen im Laden", checkPersonCount(1, "rot"));

        // Test for person count 0 when alarm level is red
        assertEquals("Maximale Personenzahl nicht überschritten", checkPersonCount(0, "rot"));
    }

    @Test
    public void testCheckPersonCountYellowLevel() {
        // Test for person count above 30 when alarm level is yellow
        assertEquals("Zu viele Personen im Laden", checkPersonCount(35, "gelb"));

        // Test for person count below 30 when alarm level is yellow
        assertEquals("Maximale Personenzahl nicht überschritten", checkPersonCount(20, "gelb"));

        // Test for person count equal to 30 when alarm level is yellow
        assertEquals("Maximale Personenzahl nicht überschritten", checkPersonCount(30, "gelb"));
    }

    @Test
    public void testCheckPersonCountGreenLevel() {
        // Test for person count above 60 when alarm level is green
        assertEquals("Zu viele Personen im Laden", checkPersonCount(65, "grün"));

        // Test for person count below 60 when alarm level is green
        assertEquals("Maximale Personenzahl nicht überschritten", checkPersonCount(50, "grün"));

        // Test for person count equal to 60 when alarm level is green
        assertEquals("Maximale Personenzahl nicht überschritten", checkPersonCount(60, "grün"));
    }



}