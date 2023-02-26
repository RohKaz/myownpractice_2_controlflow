package org.example;

public class Methods {


    public static String checkPersonCount(int personCount, String alarmLevel) {
        if (alarmLevel.equals("rot")) {
            if (personCount > 0) {
                return "Zu viele Personen im Laden";
            }
        } else if (alarmLevel.equals("gelb")) {
            if (personCount > 30) {
                return "Zu viele Personen im Laden";
            }
        } else if (alarmLevel.equals("grün")) {
            if (personCount > 60) {
                return "Zu viele Personen im Laden";
            }
        }

        return "Maximale Personenzahl nicht überschritten";
    }


}
