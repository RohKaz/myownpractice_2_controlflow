package org.example;

public class Methods {


    public static String checkPersonCount(int personCount) {
        if (personCount > 30) {
            return "Zu viele Personen im Laden";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }


}
