package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    void checkPersonCount() {
        //GIVEN
        int personCount = 31;
        Methods methods = new Methods();
        //WHEN
        String result = methods.checkPersonCount(personCount);
        //THEN
        assertEquals("Zu viele Personen im Laden", result);


    }
}